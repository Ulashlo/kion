package com.hse.kion.controller;

import com.hse.kion.service.kafka.SendMessageTask;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class Test {
    private final SendMessageTask sendMessageTask;

    @GetMapping("")
    public void test() throws ExecutionException, InterruptedException {
        sendMessageTask.send();
    }
}
