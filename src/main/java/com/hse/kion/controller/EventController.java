package com.hse.kion.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hse.kion.controller.dto.event.EventInfoForCreateDTO;
import com.hse.kion.service.LastPointViewService;
import com.hse.kion.service.kafka.Producer;
import com.hse.kion.utils.converters.EventConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static com.hse.kion.utils.converters.EventConverter.toEvent;
import static com.hse.kion.utils.converters.LastPointViewConverter.toLastPointViewInfoForUpdateDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/event")
public class EventController {
    private final LastPointViewService lastPointViewService;
    private final Producer producer;

    @PostMapping
    public void createEvent(@RequestBody EventInfoForCreateDTO dto) throws JsonProcessingException {
        lastPointViewService.updateLastPointView(toLastPointViewInfoForUpdateDTO(dto));
        producer.sendMessage("INPUT_DATA", toEvent(dto));
    }
}
