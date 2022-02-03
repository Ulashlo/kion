package com.hse.kion.service;

import com.hse.kion.controller.dto.LastPointViewDTO;
import com.hse.kion.controller.dto.LastPointViewInfoForCreateDTO;

import java.util.List;

public interface LastPointViewService {
    List<LastPointViewDTO> getLastPointViews();
    void addLastPointView(LastPointViewInfoForCreateDTO info);
}
