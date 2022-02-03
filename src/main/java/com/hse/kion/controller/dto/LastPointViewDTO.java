package com.hse.kion.controller.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class LastPointViewDTO {
    private final Long id;
    private final Integer value;
}
