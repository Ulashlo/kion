package com.hse.kion.controller.dto;

import com.hse.kion.model.EventType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Schema(name = "Event info for create")
public class EventInfoForCreateDTO {
    @NonNull
    private final Long videoId;
    @NonNull
    private final Long userId;
    @NonNull
    private final EventType type;
    @NonNull
    private final Long videoTime;
}
