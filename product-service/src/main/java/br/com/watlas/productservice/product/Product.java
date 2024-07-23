package br.com.watlas.productservice.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public record Product(
        @JsonIgnore
        @Id ObjectId id,
        String name,
        String description,
        Double price
) {
}
