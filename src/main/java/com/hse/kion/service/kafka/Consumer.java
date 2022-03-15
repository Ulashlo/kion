package com.hse.kion.service.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {

//    @KafkaListener(topics = {"INPUT_DATA"})
//    public void consume(final @Payload String message,
//                        final @Header(KafkaHeaders.OFFSET) Integer offset,
//                        final @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
//                        final @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
//                        final @Header(KafkaHeaders.RECEIVED_TIMESTAMP) long ts,
//                        final Acknowledgment acknowledgment
//    ) {
//        log.info(String.format("#### -> Consumed message -> TIMESTAMP: %d\n%s\noffset: %d\npartition: %d\ntopic: %s", ts, message, offset, partition, topic));
//        acknowledgment.acknowledge();
//    }
}

