package com.awsravi.completablefuture;

import java.util.concurrent.CompletableFuture;

public class AnyOfExample {
    public static void main(String[] args) {
        //anyOf() – Waits for any one future to complete
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Fast Task");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(5000); } catch (InterruptedException e) {}
            return "Slow Task";
        });

        //System.out.println(future1.join());
        //System.out.println(future2.join());
        CompletableFuture<Object> anyFuture = CompletableFuture.anyOf(future1, future2);

        System.out.println(anyFuture.join());
    }
}
