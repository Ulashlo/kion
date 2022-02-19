package com.hse.kion.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.OffsetDateTime;

@Getter
@AllArgsConstructor
public class Event {
    private Long id;
    private Long videoId;
    private Long userId;
    private EventType type;
    private OffsetDateTime creationDate;
    private Long videoTime;
}
