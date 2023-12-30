package com.java8features;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestDemo {
	
    private static String callService(String serviceName) {
        // Simulate service call
        return serviceName + " response";
    }

	public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> service1 = CompletableFuture.supplyAsync(() -> callService("Service 1"));
        CompletableFuture<String> service2 = CompletableFuture.supplyAsync(() -> callService("Service 2"));

        CompletableFuture<Void> allOf = CompletableFuture.allOf(service1, service2);

        allOf.get(); // Wait for all services to complete

        String result1 = service1.get();
        String result2 = service2.get();

        System.out.println("Result from Service 1: " + result1);
        System.out.println("Result from Service 2: " + result2);
	}

}
