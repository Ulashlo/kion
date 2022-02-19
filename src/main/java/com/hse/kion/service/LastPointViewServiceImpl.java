package com.hse.kion.service;

import com.hse.kion.controller.dto.LastPointViewInfoForUpdateDTO;
import com.hse.kion.repository.LastPointViewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LastPointViewServiceImpl implements LastPointViewService {
    private final LastPointViewRepository lastPointViewRepository;

    @Override
    public void updateLastPointView(LastPointViewInfoForUpdateDTO dto) {

    }
}
