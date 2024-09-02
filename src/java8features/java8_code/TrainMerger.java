package com.java8features;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TrainMerger {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java TrainMerger <input_file_path>");
            System.exit(1);
        }

        String inputFile = args[0];

        try {
            List<String> trainAOrder = new ArrayList<>();
            List<String> trainBOrder = new ArrayList<>();

            // Read input from the file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            String currentTrain = "";

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("TRAIN_A") || line.startsWith("TRAIN_B")) {
                    currentTrain = line;
                } else if (!line.trim().isEmpty()) {
                    if (currentTrain.equals("TRAIN_A")) {
                        trainAOrder.add(line);
                    } else if (currentTrain.equals("TRAIN_B")) {
                        trainBOrder.add(line);
                    }
                }
            }
            // Process and print the output
            processTrains(trainAOrder, trainBOrder);

            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading the input file: " + e.getMessage());
            System.exit(1);
        }
    }

    private static void processTrains(List<String> trainAOrder, List<String> trainBOrder) {
        // Process Train A and Train B orders
        List<String> arrivalTrainA = processTrainOrder(trainAOrder, "ARRIVAL");
        List<String> arrivalTrainB = processTrainOrder(trainBOrder, "ARRIVAL");
        List<String> departureTrainAB = processDepartureOrder(arrivalTrainA, arrivalTrainB);

        // Print the results
        printResult("ARRIVAL TRAIN_A", arrivalTrainA);
        printResult("ARRIVAL TRAIN_B", arrivalTrainB);
        printResult("DEPARTURE TRAIN_AB", departureTrainAB);
    }

    private static List<String> processTrainOrder(List<String> trainOrder, String prefix) {
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for (int i = trainOrder.size() - 1; i >= 0; i--) {
            String station = trainOrder.get(i);
            if (station.equals("ENGINE")) {
                result.add(prefix + " " + trainOrder.get(i + 1) + " ENGINE");
            } else {
                stack.push(station);
                result.add(prefix + " " + trainOrder.get(i - 1) + " " + station);
            }
        }

        while (!stack.isEmpty()) {
            result.add(prefix + " " + stack.pop());
        }

        return result;
    }

    private static List<String> processDepartureOrder(List<String> arrivalTrainA, List<String> arrivalTrainB) {
        Set<String> uniqueStations = new LinkedHashSet<>();
        uniqueStations.addAll(arrivalTrainA);
        uniqueStations.addAll(arrivalTrainB);

        List<String> departureOrder = new ArrayList<>(uniqueStations);
        Collections.sort(departureOrder, Comparator.reverseOrder());

        return processTrainOrder(departureOrder, "DEPARTURE TRAIN_AB");
    }

    private static void printResult(String header, List<String> result) {
        System.out.println(header);
        for (String line : result) {
            System.out.println(line);
        }
    }
}

