package org.example;

import java.util.List;

public class StreamAPI {

    public static int sumEvenNumbers(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;
        return numbers.stream()
                .filter(num -> num != null && num % 2 == 0)
                .mapToInt(Double::intValue)
                .sum();
    }

    public static int multiplicationOddNumbers(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;
        return numbers.stream()
                .filter(num -> num != null && num % 2 != 0)
                .mapToInt(Double::intValue)
                .reduce(1, (x, y) -> x * y);
    }

    public static Double maxValue(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) return (double) 0;
        return numbers.stream()
                .filter(num -> num != null)
                .max(Double::compareTo)
                .orElse(Double.valueOf(0));
    }

    public static int[] notEvenNumbers(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) return new int[0];
        return numbers.stream()
                .filter(num -> num != null && num % 2 != 0)
                .mapToInt(Double::intValue)
                .toArray();
    }

    public static double avarageNumber(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;
        return  numbers.stream()
                .filter(num -> num != null)
                .mapToInt(Double::intValue)
                .average()
                .orElse(0);
    }
}
