package br.com.watlas.orderservice.order;


import br.com.watlas.orderservice.order.dto.OrderDTO;
import br.com.watlas.orderservice.order.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDTO map(Order order);

    @Mapping(target = "id", ignore = true)
    Order map(OrderDTO orderDTO);

}
