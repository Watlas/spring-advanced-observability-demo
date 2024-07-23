package br.com.watlas.orderservice.order.dto;

public record OrderDTO(
        UserDTO user,
        ProductDTO product
) {

    public record UserDTO(
            String name
    ) {
    }


    public record ProductDTO(
            String name,
            String description,
            Double price
    ) {
    }

}
