package br.com.watlas.userservice.user;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produtos")
public record User(
        @Id ObjectId id,
        String name,
        String description,
        Double price
) {
}
