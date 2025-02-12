package com.awsravi.completablefuture.com.awsravi.basics;

import java.util.concurrent.CompletableFuture;

public class ThenApplyExample {
    public static void main(String[] args) {

        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> 10)
                .thenApply(value -> value * 2);
        Integer join = integerCompletableFuture.join();
        System.out.println(join);

    }
}
