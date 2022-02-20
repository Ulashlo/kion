package com.hse.kion.model.event;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(enumAsRef = true)
public enum EventType {
    OPEN,
    CLOSE,
    PLAY,
    STOP,
    REWIND,
    VIDEO_TIME_UPDATE
}
