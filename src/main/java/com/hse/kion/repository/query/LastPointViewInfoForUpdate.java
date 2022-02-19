package com.hse.kion.repository.query;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class LastPointViewInfoForUpdate {
    private final Long videoId;
    private final Long userId;
    private final Long videoTime;
}
