package com.hse.kion.service.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.hse.kion.model.event.Event;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class Producer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, Event message) throws JsonProcessingException {
        final var om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());
        final var data = om.writeValueAsString(message);
        log.info("Message: " + data);
        kafkaTemplate.send(topic, data);
    }
}
