package assignment04PartA;

public abstract class SortingAlgorithm
{
    public abstract void sort(int[] array);

    static void displayArray(int[] array)
    {
        System.out.print("[>>] Contents of Array: ");

        System.out.print("{");
        for(int n : array)
            System.out.printf("%s, ", n);
        System.out.print("\b\b}\n");
    }
}
