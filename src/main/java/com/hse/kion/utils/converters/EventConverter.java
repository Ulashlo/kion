package com.hse.kion.utils.converters;

import com.hse.kion.controller.dto.event.EventInfoForCreateDTO;
import com.hse.kion.model.event.Event;

import java.time.OffsetDateTime;

public class EventConverter {
    public static Event toEvent(EventInfoForCreateDTO info) {
        return new Event(
            info.getVideoId(),
            info.getUserId(),
            info.getType(),
            OffsetDateTime.now(),
            info.getVideoTime()
        );
    }
}
