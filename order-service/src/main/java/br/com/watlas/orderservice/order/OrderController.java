package br.com.watlas.orderservice.order;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@Tag(name = "Order", description = "Order API")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @Operation(summary = "Create a order")
    public Order save(@RequestBody Order order) {
        return orderService.save(order);
    }

}
