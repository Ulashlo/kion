package com.hse.kion.service;

import com.hse.kion.controller.dto.lastPointView.LastPointViewDTO;
import com.hse.kion.controller.dto.lastPointView.LastPointViewInfoForGetDTO;
import com.hse.kion.controller.dto.lastPointView.LastPointViewInfoForUpdateDTO;
import com.hse.kion.model.lastPointView.LastPointView;

import java.util.List;

/**
 * Service for work with {@linkplain LastPointView}
 */
public interface LastPointViewService {
    /**
     * Update last point view for determined user and video.
     *
     * @param dto last point view info for update
     */
    void updateLastPointView(LastPointViewInfoForUpdateDTO dto);

    List<LastPointViewDTO> getLastPointViewsByVideoIds(LastPointViewInfoForGetDTO dto);
}
