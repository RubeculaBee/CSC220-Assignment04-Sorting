package assignment04PartA;

public class SelectionSort extends SortingAlgorithm
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
        }
    }

    // Swaps the data in indexes i and j of the given array
    private void swap(int[] array, int i, int j)
    {
        int temp = array[i];

        array[i] = array[j];

        array[j] = temp;
    }
}
