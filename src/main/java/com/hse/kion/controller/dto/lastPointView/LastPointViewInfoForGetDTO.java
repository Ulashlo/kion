package com.hse.kion.controller.dto.lastPointView;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
@Schema(name = "Info for get last points views")
public class LastPointViewInfoForGetDTO {
    @NonNull
    private final Long userId;
    @NonNull
    private final List<Long> videoIds;
}
