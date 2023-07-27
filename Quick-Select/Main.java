package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int k = 5;

        List<Integer> listOfNumbers = new ArrayList<>();

        IntStream.range(0, n).forEach(listOfNumbers::add);

        Collections.shuffle(listOfNumbers);

        int[] array = listOfNumbers.stream().mapToInt(Integer::intValue).toArray();

        for(int num : array)
            System.out.print(num + " ");

        System.out.println();

        System.out.println("kth smallest element: " + QuickSelect.quickSelect(array, 0, array.length - 1, k));
    }
}
