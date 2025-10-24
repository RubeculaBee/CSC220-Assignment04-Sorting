package assignment04PartE;

import java.security.InvalidParameterException;

/**
 *
 * Part E
 *
 */

public final class Student implements Comparable<Student>
{
    private Comparable[] attributes;

    static private int currentPriorityIndex;
    static private String[] priorities = 
    {
        "realistic", 
        "first-name", 
        "last-name", 
        "student-id", 
        "gpa", 
        "number-of-small-questions",
        "number-of-big-questions",
        "number-of-small-and-big-questions"
    };

    public Student (String firstName, String lastName, int id, double gpa, int numSmallQuestions, int numLargeQuestions)
    {
        attributes = new Comparable[] {firstName, lastName, id, gpa, numSmallQuestions, numLargeQuestions};
    }

    static public String[] getPriorities() {return priorities;}

    static public void setCompareToPriority(String priority) throws InvalidParameterException
    {
        for(int i = 0; i < priorities.length; i++)
            if(priority == priorities[i])
            {
                currentPriorityIndex = i;
                return;
            }


        // If the requested priority isn't in the list, throw an exception
        throw new InvalidParameterException();
    }

    @Override
    public int compareTo(Student student)
    {
        //TODO Implement compareTo

        return 0;
    }

    @Override
    public String toString()
    {
        return String.format("%-10s%-10s%-10d%-3.2f%9d%8d", attributes);
    }
}