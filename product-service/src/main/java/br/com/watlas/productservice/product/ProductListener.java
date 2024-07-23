package br.com.watlas.productservice.product;

import io.opentelemetry.instrumentation.annotations.WithSpan;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ProductListener {

    private final ProductService productService;

    @KafkaListener(topics = "product-topic")
    @WithSpan("Consuming product message")
    public void listen(Product product) {
        log.info("Product received: {}", product);
        productService.save(product);
    }
}
