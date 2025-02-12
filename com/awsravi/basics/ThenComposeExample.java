package com.awsravi.completablefuture.com.awsravi.basics;

import java.util.concurrent.CompletableFuture;

public class ThenComposeExample {
    public static void main(String[] args) {
        //thenCompose() – Chains dependent futures
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hey Awsravi : Java 8")
                .thenCompose(result -> CompletableFuture.supplyAsync(() -> result + " CompletableFuture"));

        System.out.println(future.join());
    }

}
