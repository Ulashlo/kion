package com.hse.kion.model.lastPointView;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.aerospike.mapping.Document;
import org.springframework.data.aerospike.mapping.Field;
import org.springframework.data.annotation.Id;

@Getter
@AllArgsConstructor
@Document(collection = "last_point_view")
public class LastPointView {
    @Id
    private LastPointViewKey key;
    @Field("video_time")
    private Long videoTime;
}
