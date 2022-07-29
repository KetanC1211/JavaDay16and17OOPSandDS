package com.bridgelabz;

public class BubbleSortForGeneric<T extends Comparable<? super T>> {
   
    void bubbleSort(T[] array)   {
        int n = array.length;
        while (n > 0) {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++) {
                // if the item at the previous index is greater than the item at the `currentIndex`, swap them
                if (array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
                {
                    // swap
                    T temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;
                    // save the index that was modified
                    lastModifiedIndex = currentIndex;
                }
            }
            // save the last modified index so we know not to iterate past it since all proceeding values are sorted
            n = lastModifiedIndex;
        }
    }

	public static void main(String[] args)
    {
        // example using Strings
        String[] arrayOfStrings = {"game", "play", "drive", "roll", "quick"};
        BubbleSortForGeneric<String> stringSorter   = new BubbleSortForGeneric<>();
        stringSorter.bubbleSort(arrayOfStrings);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));

        // example using Doubles
        Double[]  arrayOfDoubles = {1.2,2.2,3.1,5.5,7.7,1.0,0.2,0.6};
        BubbleSortForGeneric<Double> doubleSorter   = new BubbleSortForGeneric<>();
        doubleSorter.bubbleSort(arrayOfDoubles);
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
    }
}
