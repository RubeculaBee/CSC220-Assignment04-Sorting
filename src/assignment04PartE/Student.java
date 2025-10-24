package assignment04PartE;

import java.security.InvalidParameterException;
import java.util.Arrays;

/**
 *
 * Part E
 *
 */

public final class Student implements Comparable<Student>
{
    private Comparable[] attributes;

    static private int numStudents = 0;
    static private int currentPriorityIndex;
    static private String[] priorities = 
    {
        "realistic",                        //0
        "first-name",                       //1
        "last-name",                        //2
        "student-id",                       //3
        "gpa",                              //4
        "number-of-small-questions",        //5
        "number-of-big-questions",          //6
        "number-of-small-and-big-questions" //7
    };

    public Student (String firstName, String lastName, int id, double gpa, int numSmallQuestions, int numLargeQuestions)
    {
        attributes = new Comparable[] {numStudents, firstName, lastName, id, gpa, numSmallQuestions, numLargeQuestions, numSmallQuestions + numLargeQuestions};
        numStudents++;
    }

    static public String[] getPriorities() {return priorities;}

    static public void setCompareToPriority(String priority) throws InvalidParameterException
    {
        for(int i = 0; i < priorities.length; i++)
            if(priority.equals(priorities[i]))
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
        return compareAttribute(currentPriorityIndex, student);
    }

    private int compareAttribute(int priority, Student student)
    {
        assert priority >= 0 && priority < priorities.length;

        int result = this.attributes[priority].compareTo(student.attributes[priority]);

        if(result == 0)
            return compareAttribute(priority-1, student);

        return result;
    }

    @Override
    public String toString()
    {
        return String.format("%-10s%-10s%-10d%-3.2f%9d%8d", Arrays.copyOfRange(attributes, 1, 7));
    }
}