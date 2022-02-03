package com.hse.kion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.aerospike.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document
@AllArgsConstructor
public class LastPointView {
    @Id
    private Long id;

    private Integer value;
}
