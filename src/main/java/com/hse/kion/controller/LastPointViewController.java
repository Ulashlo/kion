package com.hse.kion.controller;

import com.hse.kion.controller.dto.lastPointView.LastPointViewDTO;
import com.hse.kion.controller.dto.lastPointView.LastPointViewInfoForGetDTO;
import com.hse.kion.service.LastPointViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/lastPointView")
    public List<LastPointViewDTO> getLastPointViewsByVideoIds(@RequestBody LastPointViewInfoForGetDTO dto) {
        return lastPointViewService.getLastPointViewsByVideoIds(dto);
    }

    @GetMapping("/test")
    public Integer getTest() {
        String str = "{\n" +
            "    \"userId\" : 1,\n" +
            "    \"videoId\" : 4,\n" +
            "    \"type\" : \"PLAY\",\n" +
            "    \"videoTime\" : 10\n" +
            "}";

        HttpRequest request = HttpRequest.newBuilder()
            .headers("Content-Type", "application/json")
            .uri(URI.create("http://localhost:8080/event").normalize())
                .POST(HttpRequest.BodyPublishers.ofString(str))
                .build();

        System.out.println(request.toString());

        List<Thread> list = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            list.add(new Thread(
                () -> {
                    HttpClient client = HttpClient.newHttpClient();
                    for (int i = 0; i < 1000000; i++) {
                        try {
                            client.send(request, HttpResponse.BodyHandlers.ofString());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            ));
        }

        list.parallelStream().forEach(Thread::start);
        return 200;
    }
}
