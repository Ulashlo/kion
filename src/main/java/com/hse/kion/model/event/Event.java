package com.hse.kion.model.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.OffsetDateTime;

@Getter
@AllArgsConstructor
public class Event {
    private Long videoId;
    private Long userId;
    private EventType type;
    private String creationDate;
    private Long videoTime;
}
