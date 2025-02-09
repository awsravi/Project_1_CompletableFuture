package com.awsravi.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ThenCombineExample {
    public static void main(String[] args) {
        //thenCombine() – Combines two futures
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Aws");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "ravi");

        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (f1, f2) -> f1 + f2);

        System.out.println(combinedFuture.join());
    }
}
