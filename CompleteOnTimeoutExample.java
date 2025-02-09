package com.awsravi.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompleteOnTimeoutExample {
    public static void main(String[] args) {
        //completeOnTimeout() – Returns default value if execution exceeds timeout
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            return "Completed!";
        }).completeOnTimeout("Default Value", 1, TimeUnit.SECONDS);

        System.out.println(future.join()); // Output: Default Value (if delayed)
    }
}
