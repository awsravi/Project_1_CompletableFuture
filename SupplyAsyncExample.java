package com.awsravi.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class SupplyAsyncExample {
    public static void main(String[] args) {
        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> "Hello! awsravi");
        System.out.println(stringCompletableFuture.join());

    }
}
