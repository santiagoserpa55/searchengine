package com.santiago.app;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.time.Duration;
import java.util.concurrent.*;

public class LoadTest {

    public static void main(String[] args) throws InterruptedException {
        int concurrentRequests = 100; // Número de peticiones concurrentes
        ExecutorService executor = Executors.newFixedThreadPool(concurrentRequests);

        String url = "http://localhost:8080/data";
        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .build();

        Runnable task = () -> {
            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .GET()
                        .build();

                long startTime = System.nanoTime();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                long endTime = System.nanoTime();

                System.out.println("Respuesta: " + response.statusCode() +
                                   ", Tiempo: " + (endTime - startTime) / 1_000_000 + " ms");
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        };

        for (int i = 0; i < concurrentRequests; i++) {
            executor.submit(task);
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }
}
