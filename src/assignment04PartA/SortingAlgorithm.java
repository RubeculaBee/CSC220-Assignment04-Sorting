package assignment04PartA;

public abstract class SortingAlgorithm
{
    public abstract void sort(int[] array);

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
