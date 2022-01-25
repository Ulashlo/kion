package com.hse.kion.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/event")
public class EventController {
    @PostMapping
    public String pushVideoEvent() {
        return "test";
    }
}
