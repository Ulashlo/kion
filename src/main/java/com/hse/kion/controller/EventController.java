package com.hse.kion.controller;

import com.hse.kion.controller.dto.event.EventInfoForCreateDTO;
import com.hse.kion.service.LastPointViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static com.hse.kion.utils.converters.LastPointViewConverter.toLastPointViewInfoForUpdateDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/event")
public class EventController {
    private final LastPointViewService lastPointViewService;

    @PostMapping
    public void createEvent(@RequestBody EventInfoForCreateDTO dto) {
        lastPointViewService.updateLastPointView(toLastPointViewInfoForUpdateDTO(dto));
    }
}
