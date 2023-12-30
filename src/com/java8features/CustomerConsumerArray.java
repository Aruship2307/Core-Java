package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class ConsumerTest implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        System.out.println("Multiplication of given Number: " + t * t);
    }
}

public class CustomerConsumerArray {
    public static void main(String[] args) {
        Consumer<Integer> ci = new ConsumerTest();
        ci.accept(5);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(13);
        numbers.add(20);
        numbers.add(4);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()  // Sorting the numbers in ascending order
                .collect(Collectors.toList());
        
        System.out.println(sortedNumbers);
    }
}

