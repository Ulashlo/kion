package com.hse.kion.controller;

import com.hse.kion.controller.dto.LastPointViewDTO;
import com.hse.kion.controller.dto.LastPointViewInfoForCreateDTO;
import com.hse.kion.model.LastPointView;
import com.hse.kion.repository.TestRepository;
import com.hse.kion.service.LastPointViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lastPointView")
public class EventController {
    private final LastPointViewService lastPointViewService;
    private final TestRepository testRepository;

    @GetMapping
    public LastPointView getLastPointView() {
        return testRepository.findById(1L);
    }

    @PostMapping
    public void addLastPointView(@RequestBody LastPointViewInfoForCreateDTO info) {
        lastPointViewService.addLastPointView(info);
    }
}
