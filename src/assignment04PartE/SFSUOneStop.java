package assignment04PartE;

/**
 *
 * Part E
 *
 */

import java.util.PriorityQueue;

public class SFSUOneStop 
{
	public static void display(PriorityQueue<Student> pq, String priority)
    {
        System.out.printf("Priority: %s%s\n", priority, priority=="realistic"? " (provided by supervisors)" : "");
        
        int size = pq.size();
        for(int i = 0; i < size; i++)
            System.out.printf("%10s%s\n", "", pq.poll());
        
        System.out.print("\n");
    }
}
