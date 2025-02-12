package com.awsravi.completablefuture.com.awsravi.basics;

import java.util.concurrent.CompletableFuture;

public class ThenAcceptExample {
    public static void main(String[] args) {

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> "awsravi")
                .thenAccept(result -> System.out.println(
                        "Received :: " + result));
        voidCompletableFuture.join();
        System.out.println("Executed By :: " + Thread.currentThread().getName());
        CompletableFuture.runAsync(() -> {}).join();

    }
}
