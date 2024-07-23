package br.com.watlas.userservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public record User(
        @JsonIgnore
        @Id ObjectId id,
        String name
) {
}
