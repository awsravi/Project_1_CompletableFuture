package com.awsravi.completablefuture.com.awsravi.basics;

import java.util.concurrent.CompletableFuture;

public class ThenRunExample {
    public static void main(String[] args) {
        //thenRun() – Runs a task after completion (no input, no output)
        CompletableFuture.supplyAsync(() -> "Task Completed")
                .thenRun(() -> System.out.println("Follow-up Task Executed!"))
                .join();
    }

}
