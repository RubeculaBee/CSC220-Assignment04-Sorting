package assignment04PartA;

sealed abstract class SortingAlgorithm
{
    abstract void sort(int[] array);

    static void displayArray(int[] array)
    {
        System.out.print("{");
        for(int n : array)
            System.out.printf("%s, ", n);
        System.out.print("\b\b}\n");
    }

    // Swaps the data in indexes i and j of the given array
    void swap(int[] array, int i, int j)
    {
        int temp = array[i];

        array[i] = array[j];

        array[j] = temp;
    }
}

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

final class ShellSort extends SortingAlgorithm
{
    public void sort(int[] array)
    {
        // TODO: Implement Sorting Algorithm
    }
}

final class InsertionSort extends SortingAlgorithm
{
    public void sort(int[] array)
    {
        // TODO: Implement Sorting Algorithm
    }
}
