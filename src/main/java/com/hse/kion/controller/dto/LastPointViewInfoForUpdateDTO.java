package com.hse.kion.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Schema(name = "Last point view info for update")
public class LastPointViewInfoForUpdateDTO {
    @NonNull
    private final Long videoId;
    @NonNull
    private final Long userId;
    @NonNull
    private final Long videoTime;
}
