package org.example;

import java.util.Random;

public class QuickSelect {
    public static int quickSelect(int[] array, int low, int high, int k) {
        if(low == high)
            return array[low];

        int partition = partition(array, low, high);

        if(partition == k - 1)
            return array[partition];

        else if (partition < k - 1)
            return quickSelect(array, partition + 1, high, k);

        else return quickSelect(array, low, partition - 1, k);
    }

    public static int partition(int[] array, int low, int high) {
        int randomPivot = new Random().nextInt(high - low) + low;

        swap(array, low, randomPivot);

        int L = low;

        int R = high;

        while(L < R) {
            if(array[L + 1] <= array[L]) {
                swap(array, L, L + 1);
                L++;
            } else if(array[R] > array[L])
                R--;
            else swap(array, L + 1, R);
        }

        return L;
    }

    public static void swap(int[] array, int firstElement, int secondElement) {
        int temp = array[firstElement];

        array[firstElement] = array[secondElement];

        array[secondElement] = temp;
    }
}
