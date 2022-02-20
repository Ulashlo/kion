package com.hse.kion.utils.converters;

import com.hse.kion.controller.dto.event.EventInfoForCreateDTO;
import com.hse.kion.controller.dto.lastPointView.LastPointViewDTO;
import com.hse.kion.controller.dto.lastPointView.LastPointViewInfoForUpdateDTO;
import com.hse.kion.model.lastPointView.LastPointView;
import com.hse.kion.model.lastPointView.LastPointViewKey;

public final class LastPointViewConverter {
    public static LastPointView toLastPointView(LastPointViewInfoForUpdateDTO dto) {
        return new LastPointView(
            new LastPointViewKey(
                dto.getUserId(),
                dto.getVideoId()
            ),
            dto.getVideoTime()
        );
    }

    public static LastPointViewDTO toLastPointViewDTO(LastPointView lastPointView) {
        final var key = lastPointView.getKey();
        return new LastPointViewDTO(
            key.getUserId(),
            key.getVideoId(),
            lastPointView.getVideoTime()
        );
    }

    public static LastPointViewInfoForUpdateDTO toLastPointViewInfoForUpdateDTO(EventInfoForCreateDTO dto) {
        return new LastPointViewInfoForUpdateDTO(
            dto.getUserId(),
            dto.getVideoId(),
            dto.getVideoTime()
        );
    }
}
