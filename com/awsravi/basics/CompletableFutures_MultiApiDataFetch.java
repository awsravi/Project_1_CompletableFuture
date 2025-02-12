package com.awsravi.completablefuture.com.awsravi.basics;

import com.awsravi.p1.MultiApiDataFetch_CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutures_MultiApiDataFetch {

    public CompletableFuture<String> fetchWeatherData() {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(2000); // Simulating API delay
            return "Weather: Sunny, 25°C";
        });
    }

    public CompletableFuture<String> fetchNewsHeadlines() {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(3000); // Simulating API delay
            return "News: Java 23 Released!";
        });
    }

    public CompletableFuture<String> fetchStockPrices() {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(1500); // Simulating API delay
            return "Stocks: AAPL - $150, GOOGL - $2800";
        });
    }

    private void simulateDelay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        MultiApiDataFetch_CompletableFuture fetcher = new MultiApiDataFetch_CompletableFuture();

        // Fetching data asynchronously
        CompletableFuture<String> weatherFuture = fetcher.fetchWeatherData();
        CompletableFuture<String> newsFuture = fetcher.fetchNewsHeadlines();
        CompletableFuture<String> stockFuture = fetcher.fetchStockPrices();

        // Wait for all futures to complete
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(weatherFuture, newsFuture, stockFuture);

        // Process results after all futures are completed
        allFutures.thenRun(() -> {
            String weather = weatherFuture.join();
            String news = newsFuture.join();
            String stock = stockFuture.join();

            System.out.println("✅ Aggregated Data:");
            System.out.println(weather);
            System.out.println(news);
            System.out.println(stock);
        }).join(); // Ensure main thread waits for execution to complete
        /* output:
        Aggregated Data :
        Weather: Sunny, 25°C
        News: Java 23 Released!
        Stocks: AAPL - $150, GOOGL - $2800
         */
    }
}
