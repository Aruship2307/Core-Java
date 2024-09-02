package com.faq.imp.program;
import java.util.ArrayList;
import java.util.Collections;

public class SecondHighestValueAL {
    public static int findSecondHighest(ArrayList<Integer> numbers) {
        if (numbers.size() < 2)
            throw new IllegalArgumentException("At least two numbers required.");

        Collections.sort(numbers);
        return numbers.get(numbers.size() - 2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(12);
        numbers.add(3);
        
       // System.out.println(numbers.size());

        int secondHighest = findSecondHighest(numbers);
        System.out.println("Second highest value: " + secondHighest);  // Output: 10
    }
}

