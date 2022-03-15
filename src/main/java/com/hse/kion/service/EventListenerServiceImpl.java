package com.hse.kion.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hse.kion.model.event.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventListenerServiceImpl implements EventListenerService {
    private static final String TOPIC = "EVENT_DATA";
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendEventToKafka(Event event) throws JsonProcessingException {
        final var om = new ObjectMapper();
        final var data = om.writeValueAsString(event);
        kafkaTemplate.send(TOPIC, data);
    }
}
