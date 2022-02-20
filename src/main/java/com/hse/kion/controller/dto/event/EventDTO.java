package com.hse.kion.controller.dto.event;

import com.hse.kion.model.event.EventType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.OffsetDateTime;

@Getter
@RequiredArgsConstructor
@Schema(name = "Event")
public class EventDTO {
    @NonNull
    private final Long id;
    @NonNull
    private final Long userId;
    @NonNull
    private final Long videoId;
    @NonNull
    private final EventType type;
    @NonNull
    private final OffsetDateTime creationDate;
    @NonNull
    private final Long videoTime;
}
