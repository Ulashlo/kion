package com.hse.kion.service;

import com.hse.kion.controller.dto.LastPointViewInfoForUpdateDTO;
import com.hse.kion.model.LastPointView;

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
}
