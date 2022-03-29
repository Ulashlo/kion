package com.hse.kion.controller;

import com.hse.kion.controller.dto.lastPointView.LastPointViewDTO;
import com.hse.kion.controller.dto.lastPointView.LastPointViewInfoForGetDTO;
import com.hse.kion.service.LastPointViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class LastPointViewController {
    private final LastPointViewService lastPointViewService;

    @PostMapping("/lastPointView")
    public List<LastPointViewDTO> getLastPointViewsByVideoIds(@RequestBody LastPointViewInfoForGetDTO dto) {
        return lastPointViewService.getLastPointViewsByVideoIds(dto);
    }
}
