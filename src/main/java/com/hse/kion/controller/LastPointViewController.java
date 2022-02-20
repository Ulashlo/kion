package com.hse.kion.controller;

import com.hse.kion.controller.dto.lastPointView.LastPointViewDTO;
import com.hse.kion.controller.dto.lastPointView.LastPointViewInfoForGetDTO;
import com.hse.kion.service.LastPointViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lastPointView")
public class LastPointViewController {
    private final LastPointViewService lastPointViewService;

    @GetMapping
    public List<LastPointViewDTO> getLastPointViewsByVideoIds(@RequestBody LastPointViewInfoForGetDTO dto) {
        return lastPointViewService.getLastPointViewsByVideoIds(dto);
    }
}
