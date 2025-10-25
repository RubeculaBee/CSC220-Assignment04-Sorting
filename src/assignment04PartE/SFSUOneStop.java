package assignment04PartE;

/**
 *
 * Part E
 *
 */

/*
 * File: SFSUOneStop.java
 * By:   Robin Lane
 * Date: 10-24-25
 * 
 * Description: A simple class representing the One Stop Student Services Center.
 *              it's only purpose is to correctly format and display each
 *              priority queue of students.
 */

import java.util.PriorityQueue;

public class SFSUOneStop 
{
    /**
     * @param pq The priority queue to be displayed
     * @param priority The name of the attribute we are sorting by
     */
	public static void display(PriorityQueue<Student> pq, String priority)
    {
        System.out.printf("Priority: %s%s\n", priority, priority=="realistic"? " (provided by supervisors)" : "");
        
        int size = pq.size();
        for(int i = 0; i < size; i++)
            System.out.printf("%10s%s\n", "", pq.poll());
        
        System.out.print("\n");
    }
}
