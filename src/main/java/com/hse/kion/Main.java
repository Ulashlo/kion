package com.hse.kion;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
        for (int j = 0; j < 1; j++) {
            list.add(new Thread(
                () -> {
                    HttpClient client = HttpClient.newHttpClient();
                    for (int i = 0; i < 1; i++) {
                        try {
                            final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                            System.out.println(response);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            ));
        }

        list.parallelStream().forEach(Thread::start);
    }
}
