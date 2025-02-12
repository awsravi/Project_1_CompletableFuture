package com.awsravi.completablefuture.com.awsravi.basics;

import java.util.concurrent.CompletableFuture;

public class RunAsyncExample {
    public static void main(String[] args) {

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
            System.out.println("Hello! awsravi Welcome!! : " + Thread.currentThread().getName() );
        });

        voidCompletableFuture.join();

        System.out.println("Hello! awsravi  : " + Thread.currentThread().getName() + "  Thread");
    }
}
