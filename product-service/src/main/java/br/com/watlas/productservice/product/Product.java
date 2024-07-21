package br.com.watlas.productservice.product;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produtos")
public record Product(
        @Id Integer id,
        String name,
        String description,
        Double price
) {
}
