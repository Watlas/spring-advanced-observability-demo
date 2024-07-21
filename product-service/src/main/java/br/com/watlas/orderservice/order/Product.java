package br.com.watlas.orderservice.order;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produtos")
public record Product(
        @Id ObjectId id,
        String name,
        String description,
        Double price
) {
}
