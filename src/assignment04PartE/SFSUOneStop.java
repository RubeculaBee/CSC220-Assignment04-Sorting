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
        
        for(Object student : pq.toArray())
            System.out.println(student);
        
        System.out.print("\n");
    }
}
