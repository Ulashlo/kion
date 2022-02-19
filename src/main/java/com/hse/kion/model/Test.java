package com.hse.kion.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import org.springframework.data.aerospike.mapping.Document;
import org.springframework.data.aerospike.mapping.Field;
import org.springframework.data.annotation.Id;

@Value // (1)
@Document(collection = "demo-service-movies") // (2)
@Builder(toBuilder = true) // (3)
// Spring Data object creation can use all-args constructor instead of reflection which is much faster
@AllArgsConstructor // (4)
public class Test {
    @Id // (5)
    Long id;

    @Field // (6)
    String name;
}
