package com.hse.kion.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hse.kion.controller.dto.event.EventInfoForCreateDTO;
import com.hse.kion.service.EventListenerService;
import com.hse.kion.service.LastPointViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.hse.kion.utils.converters.EventConverter.toEvent;
import static com.hse.kion.utils.converters.LastPointViewConverter.toLastPointViewInfoForUpdateDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/event")
public class EventController {
    private final LastPointViewService lastPointViewService;
    private final EventListenerService producer;

    @PostMapping
    public void createEvent(@RequestBody EventInfoForCreateDTO dto) throws JsonProcessingException {
        lastPointViewService.updateLastPointView(toLastPointViewInfoForUpdateDTO(dto));
        producer.sendEventToKafka(toEvent(dto));
    }
}
