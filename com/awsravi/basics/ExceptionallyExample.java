package com.awsravi.completablefuture.com.awsravi.basics;

import java.util.concurrent.CompletableFuture;

public class ExceptionallyExample {
    public static void main(String[] args) {
        //exceptionally() – Handles exceptions and returns a fallback value
        CompletableFuture<Object> future = CompletableFuture.supplyAsync(() -> {
            throw new RuntimeException("Something went wrong!");
        }).exceptionally(ex -> {
            System.out.println("Exception: " + ex.getMessage());
            return 0; // Fallback value
        });

        System.out.println(future.join()); // Output: Exception: Something went wrong! \n 0
    }

}
