package com.awsravi.completablefuture;

import java.util.concurrent.CompletableFuture;

public class AllOfExample {
    public static void main(String[] args) {
        //allOf() – Waits for all futures to complete
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Task 1 aws");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Task 2 react.js");

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2);
        allFutures.join(); // Wait for completion

        System.out.println(future1.join());
        System.out.println(future2.join());
    }
}
