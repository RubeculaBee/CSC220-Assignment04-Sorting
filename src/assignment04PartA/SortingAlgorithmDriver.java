package assignment04PartA;

import java.util.Scanner;

public class SortingAlgorithmDriver
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        SortingAlgorithm algo = chooseAlgo();

        algo.sort();
    }

    private static SortingAlgorithm chooseAlgo()
    {
        String[] options = {"Selection Sort", "Insertion Sort", "Shell Sort"};
        
        System.out.println("[>>] Which Algorithm would you like to use?");
        for(int i = 0; i < options.length; i++)
            System.out.printf("[>>] %d: %s\n", i+1, options[i]);
        
        System.out.print("[<<] ");

        return switch(input.nextInt())
        {
            case 1 -> new SelectionSort();
            case 2 -> new InsertionSort();
            case 3 -> new ShellSort();
            
            // TODO: Handle Default case better (make user choose again if their choice is invalid)
            default -> new SelectionSort();
        };
    }
}
