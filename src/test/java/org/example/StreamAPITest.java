package org.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StreamAPITest {

    @Test
    public void sumEvenNumbers() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        int expected = 30;
        int result = StreamAPI.sumEvenNumbers(numbers);
        assertEquals(expected, result);

        List<Double> veryBigValue = Arrays.asList(1.0, 999999.0, 3.0, 4.0, 125.0, 6.0, 7.0, 666.0, 9.0, 10.0);
        int expectedVeryBigValue =  686;
        int resultVeryBigValue = StreamAPI.sumEvenNumbers(veryBigValue);
        assertEquals(expectedVeryBigValue, resultVeryBigValue);

        List<Double> emptyList = Arrays.asList();
        int expectedEmpty = 0;
        int resultEmpty = StreamAPI.sumEvenNumbers(emptyList);
        assertEquals(expectedEmpty, resultEmpty);

        int resultNull = StreamAPI.sumEvenNumbers(null);
        assertEquals(expectedEmpty, resultNull);
    }

    @Test
    public void multiplicationOddNumbers() {
        List<Double> numbers = Arrays.asList(1.0, 3.0, 5.0, 7.0, 9.0);
        int expected = 945;
        int result = StreamAPI.multiplicationOddNumbers(numbers);
        assertEquals(expected, result);

        List<Double> numbersMinus = Arrays.asList(-1.0, 3.0, -5.0, -7.0, 9.0);
        int expectedMinus = -945;
        int resultMinus = StreamAPI.multiplicationOddNumbers(numbersMinus);
        assertEquals(expectedMinus, resultMinus);

        List<Double> numbersWithZero = Arrays.asList(0.0, 3.0, 5.0, 7.0, 9.0);
        int expectedZero = 945;
        int resultZero = StreamAPI.multiplicationOddNumbers(numbersWithZero);
        assertEquals(expectedZero, resultZero);

        List<Double> emptyList = Arrays.asList();
        int expectedEmpty = 0;
        int resultEmpty = StreamAPI.multiplicationOddNumbers(emptyList);
        assertEquals(expectedEmpty, resultEmpty);

        int resultNull = StreamAPI.multiplicationOddNumbers(null);
        assertEquals(expectedEmpty, resultNull);
    }

    @Test
    public void maxValue() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        double expected = 10;
        double result = StreamAPI.maxValue(numbers);
        assertEquals(expected, result, 0.0001);

        List<Double> numbersDuplicates = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 10.0);
        double expectedDuplicates = 10;
        double resultDuplicates = StreamAPI.maxValue(numbersDuplicates);
        assertEquals(expectedDuplicates, resultDuplicates, 0.0001);

        List<Double> numbersMaxStart = Arrays.asList(1000.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        double expectedMaxStart = 1000;
        double resultMaxStart = StreamAPI.maxValue(numbersMaxStart);
        assertEquals(expectedMaxStart, resultMaxStart, 0.0001);

        List<Double> emptyList = Arrays.asList();
        double expectedEmpty = 0;
        double resultEmpty = StreamAPI.maxValue(emptyList);
        assertEquals(expectedEmpty, resultEmpty, 0.0001);

        double resultNull = StreamAPI.maxValue(null);
        assertEquals(expectedEmpty, resultNull, 0.0001);
    }

    @Test
    public void notEvenNumbers() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        int[] expected = {1, 3, 5, 7, 9};
        int[] result = StreamAPI.notEvenNumbers(numbers);
        assertArrayEquals(expected, result);

        List<Double> numbersRandom = Arrays.asList(7.0, 4.0, 22.0, 1.0, 16.0, 13.0, 19.0, 21.0, 13.0);
        int[] expectedRandom = {7, 1, 13, 19, 21, 13};
        int[] resultRandom = StreamAPI.notEvenNumbers(numbersRandom);
        assertArrayEquals(expectedRandom, resultRandom);

        List<Double> numbersWithZero = Arrays.asList(0.0, 3.0, 5.0, 7.0, 9.0);
        int[] expectedWithZero = {3, 5, 7, 9};
        int[] resultWithZero = StreamAPI.notEvenNumbers(numbersWithZero);
        assertArrayEquals(expectedWithZero, resultWithZero);

        List<Double> numbersWithZeroMinus = Arrays.asList(0.0, 3.0, 5.0, 7.0, 9.0, -2.0, -3.0, -16.0, -21.0, -33.0);
        int[] expectedWithZeroMinus = {3, 5, 7, 9, -3, -21, -33};
        int[] resultWithZeroMinus = StreamAPI.notEvenNumbers(numbersWithZeroMinus);
        assertArrayEquals(expectedWithZeroMinus, resultWithZeroMinus);

        List<Double> emptyList = Arrays.asList();
        int[] expectedEmpty = {};
        int[] resultEmpty = StreamAPI.notEvenNumbers(emptyList);
        assertArrayEquals(expectedEmpty, resultEmpty);

        int[] resultNull = StreamAPI.notEvenNumbers(null);
        assertArrayEquals(expectedEmpty, resultNull);
    }

    @Test
    public void avarageNumber() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        double expected = 5.5;
        double result = StreamAPI.avarageNumber(numbers);
        assertEquals(expected, result, 0.0001);

        List<Double> numbersMinus = Arrays.asList(-1.0, -3.0, -5.0, -2.0, 9.0);
        double expectedMinus = -0.4;
        double resultMinus = StreamAPI.avarageNumber(numbersMinus);
        assertEquals(expectedMinus, resultMinus, 0.0001);

        List<Double> numbersWithZero = Arrays.asList(0.0, 3.0, 5.0, 2.0, 10.0);
        double expectedZero = 4;
        double resultZero = StreamAPI.avarageNumber(numbersWithZero);
        assertEquals(expectedZero, resultZero, 0.0001);

        List<Double> emptyList = Arrays.asList();
        double expectedEmpty = 0;
        double resultEmpty = StreamAPI.avarageNumber(emptyList);
        assertEquals(expectedEmpty, resultEmpty, 0.0001);

        double resultNull = StreamAPI.avarageNumber(null);
        assertEquals(expectedEmpty, resultNull, 0.0001);
    }
}
