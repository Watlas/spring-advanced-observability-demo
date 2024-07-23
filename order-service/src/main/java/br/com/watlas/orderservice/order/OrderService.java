package br.com.watlas.orderservice.order;

import br.com.watlas.orderservice.order.dto.OrderDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final KafkaTemplate<String, OrderDTO.ProductDTO> kafkaTemplate;
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    @Value("${app.user-service.url}")
    private String userServiceUrl;
    private final RestTemplate restTemplate;

    @Transactional
    public OrderDTO save(OrderDTO orderDTO) {
        var order = orderMapper.map(orderDTO);

        restTemplate.postForEntity(userServiceUrl+"/users", orderDTO.user(), Void.class);

        kafkaTemplate.send("product-topic", UUID.randomUUID().toString(), orderDTO.product());

        return orderMapper.map(orderRepository.save(order));
    }
}
