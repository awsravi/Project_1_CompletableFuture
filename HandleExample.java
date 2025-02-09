package com.awsravi.completablefuture;

import java.util.concurrent.CompletableFuture;

public class HandleExample {
    public static void main(String[] args) {
        //handle() – Processes result or exception
        CompletableFuture<Object
                > future = CompletableFuture.supplyAsync(() -> {
            throw new RuntimeException("Error occurred!");
        }).handle((result, ex) -> {
            if (ex != null) {
                System.out.println("Handled Exception: " + ex.getMessage());
                return 0; // Fallback value
            }
            return result;
        });

        System.out.println(future.join()); // Output: Handled Exception: Error occurred! \n 0

    }
}
