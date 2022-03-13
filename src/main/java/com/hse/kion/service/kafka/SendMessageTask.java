package com.hse.kion.service.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.time.LocalDate;
import java.util.concurrent.ExecutionException;

@RequiredArgsConstructor
@Component
@Slf4j
public class SendMessageTask {
    private final Producer producer;

//    public void send() throws InterruptedException, ExecutionException {
//
//        ListenableFuture<SendResult<String, String>> listenableFuture = this.producer.sendMessage("INPUT_DATA", , LocalDate.now().toString());
//
//        SendResult<String, String> result = listenableFuture.get();
//        log.info(String.format("Produced:\ntopic: %s\noffset: %d\npartition: %d\nvalue size: %d",
//            result.getRecordMetadata().topic(),
//            result.getRecordMetadata().offset(),
//            result.getRecordMetadata().partition(),
//            result.getRecordMetadata().serializedValueSize()));
//    }
}