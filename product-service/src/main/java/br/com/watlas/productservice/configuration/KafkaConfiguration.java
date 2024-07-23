package br.com.watlas.productservice.configuration;

import br.com.watlas.productservice.product.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;


@Slf4j
@EnableKafka
@Configuration
public class KafkaConfiguration {

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Product>
    kafkaListenerContainerFactory(KafkaProperties kafkaProperties) {
        // Creation of consumer factory.
        ConcurrentKafkaListenerContainerFactory<String, Product> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        // Configuration of consumer, serializer, and deserializer.
        factory.setConsumerFactory(consumerFactory(kafkaProperties));
        return factory;
    }


    @Bean
    public KafkaTemplate<String, Product> kafkaTemplate(KafkaProperties kafkaProperties) {
        // Creation of KafkaTemplate, the Product needs it to send a message in cases of DLT.
        return new KafkaTemplate<>(
                // Creation of the producer factory with Kafka's configurations.
                new DefaultKafkaProducerFactory<>(kafkaProperties.buildProducerProperties(null),
                        // Key serializer.
                        new StringSerializer(), new JsonSerializer<>(new TypeReference<>() {
                })));
    }


    private static ConsumerFactory<String, Product> consumerFactory(KafkaProperties kafkaProperties) {
        JsonDeserializer<Product> jsonDeserializer = new JsonDeserializer<>(Product.class);
        jsonDeserializer.setUseTypeHeaders(false);
        ErrorHandlingDeserializer<Product> deserializer =
                new ErrorHandlingDeserializer<>(jsonDeserializer);
        return new DefaultKafkaConsumerFactory<>(kafkaProperties.buildConsumerProperties(null),
                new StringDeserializer(), deserializer);
    }

}
