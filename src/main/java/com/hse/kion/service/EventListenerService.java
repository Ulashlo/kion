package com.hse.kion.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hse.kion.model.event.Event;

/**
 * Service for work with {@linkplain Event}
 */
public interface EventListenerService {
    /**
     * Send event info to kafka.
     *
     * @param event event info
     */
    void sendEventToKafka(Event event) throws JsonProcessingException;
}
