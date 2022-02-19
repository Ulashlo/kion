package com.hse.kion.controller;

import com.hse.kion.model.LastPointView;
import com.hse.kion.model.Test;
import com.hse.kion.repository.OldTestRepository;
import com.hse.kion.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lastPointView")
public class EventController {
    private final TestRepository testRepository;

    @GetMapping
    public Test getLastPointView() {
        testRepository.save(new Test(1L, "qqwe"));
        return testRepository.findById(1L).orElse(null);
    }
}
