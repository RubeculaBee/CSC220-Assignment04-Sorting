package assignment04PartA;

/*
 * File: SortingAlgorithm.java
 * By:   Robin Lane
 * Date: 10-19-25
 * 
 * Description: 3 Sorting algorithms (Selection, Insertion, and Shell sort)
 *              used for Part A of this assignment. Designed to only work with
 *              ints, as that is all that was requested by the client.
 */


 /**
  * * Super class that all sorting algorithms will extend, ensuring they have a sort method, can swap indices, and can display contents of an array
  */
sealed abstract class SortingAlgorithm
{
    /**
     * {@param array An integer array to be sorted}
     */
    abstract void sort(int[] array);

    /**
     * {@param array The array whose contents will be displayed}
     */
    static void displayArray(int[] array)
    {
        System.out.print("{");
        for(int n : array)
            System.out.printf("%s, ", n);
        // The two backspaces remove the final comma and space, since they would follow the last entry
        System.out.print("\b\b}\n");
    }

    /**
     * {@param array The array to swap items in}
     * {@param i The index of the first item that will be swapped with index j}
     * {@param j The index of the second item that will be swapped with index i}
     */
    void swap(int[] array, int i, int j)
    {
        int temp = array[i];

        array[i] = array[j];

        array[j] = temp;
    }
}

/**
 * * Searches the unsorted array for the smallest number, and swaps it with the first index of the unsorted array
 */
final class SelectionSort extends SortingAlgorithm
{
    public void sort(int[] array)
    {
        // Loop through the array, don't check the last one since it wont ever be swapped with anything
        for(int i = 0; i < array.length - 1; i++)
        {
            // assume the index in question is the smallest until proven otherwise.
            int indexOfLeast = i;

            // Find smallest number in sub array
            // The "sub array" is any item that comes after the sorted items
            for(int j = i+1; j < array.length; j++)
                if(array[j] < array[indexOfLeast])
                    indexOfLeast = j;

            // Swap smallest with the current index
            swap(array, i, indexOfLeast);
            
            displayArray(array);
        }
    }
}

/**
 * * For each index in the array, move the item back until it's larger than everything before it but smaller than anything after it
 */
final class InsertionSort extends SortingAlgorithm
{
    public void sort(int[] array)
    {
        // TODO: Implement Sorting Algorithm
    }
}

/**
 * * A modification of insertion sort. Sort (via insertion sort) sub-arrays of the array that are n indices apart. After each pass, n is halved.
 * * Insertion sort works better on lists that are "almost sorted", thus by sorting several smaller sublists, we can sort a total list faster.
 */
final class ShellSort extends SortingAlgorithm
{
    public void sort(int[] array)
    {
        // TODO: Implement Sorting Algorithm
    }
}


