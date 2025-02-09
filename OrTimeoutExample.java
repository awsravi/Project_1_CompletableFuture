package com.awsravi.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class OrTimeoutExample {
    public static void main(String[] args) {
        //orTimeout() – Fails if execution exceeds timeout
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            return "Completed!";
        }).orTimeout(1, TimeUnit.SECONDS);

        try {
            System.out.println(future.join());
        } catch (Exception e) {
            System.out.println("Timeout occurred: " + e.getMessage());
            //output :Timeout occurred: java.util.concurrent.TimeoutException
        }
    }
}
