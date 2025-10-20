package assignment04PartA;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * File: SortingAlgorithmDriver.java
 * By:   Robin Lane
 * Date: 10-19-25
 * 
 * Description: Allows the user to pick a sorting algorithm from the following choices:
 *              [1] Selection Sort
 *              [2] Insertion Sort
 *              [3] Shell Sort
 *              Then sorts a predefined array using that sorting algorithm.
 */

public class SortingAlgorithmDriver
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("-".repeat(64));
            runTest();
        }
    }

    /**
     * Initialises the array, chooses a sorting algorithm, and sorts the array
     */
    private static void runTest()
    {
        int[] array = new int[] {2, 5, 8, 4, 7, 9, 6, 5, 9, 4, 3, 1};
        
        SortingAlgorithm algo;
        while(true)
        {
            try{
                algo = chooseAlgo();
            }
            catch(IOException e){
                System.out.printf("\n[xx] %s: Please select again.\n", e.getMessage());
                continue;
            }
            
            break;
        }
        
        System.out.print("\n[>>] Initial Contents of Array: ");
        SortingAlgorithm.displayArray(array);

        System.out.println("\n[++] Sorting Array...");
        algo.sort(array);

        System.out.print("\n[>>] Final Contents of Array: ");
        SortingAlgorithm.displayArray(array);
    }

    /**
     * @return SortingAlgorithm object of a subclass chosen by the user
     * @throws IOException when the switch statement gets an invalid value.
     */
    private static SortingAlgorithm chooseAlgo() throws IOException
    {
        String[] options = {"Selection Sort", "Insertion Sort", "Shell Sort"};
        
        System.out.println("[>>] Which Algorithm would you like to use?");
        for(int i = 0; i < options.length; i++)
            System.out.printf("[##] %d: %s\n", i+1, options[i]);
        System.out.println("[##] 0: Exit");
        
        int choice;
        while (true)
        {
            System.out.print("[<<] ");

            try{
                choice = input.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("[xx] Invalid Choice.");
                input.nextLine();
                continue;
            }

            if(choice > options.length || choice < 0)
            {
                System.out.println("[xx] Invalid Choice.");
                continue;
            }

            break;
        }

        if(choice == 0)
        {
            System.out.println("\n[//] Thank you for using the system.");
            System.exit(0);
        }

        return switch(choice)
        {
            case 1 -> new SelectionSort();
            case 2 -> new InsertionSort();
            case 3 -> new ShellSort();
            
            // Should never throw this exception, since choice is only allowed to be 1 2 or 3 by this point, but we handle it anyway to be safe
            default -> throw new IOException("Unexpected Invalid Value Exception");
        };
    }
}
