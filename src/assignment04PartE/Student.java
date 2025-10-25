package assignment04PartE;

import java.security.InvalidParameterException;
import java.util.Arrays;

/**
 *
 * Part E
 *
 */

 /*
 * File: Student.java
 * By:   Robin Lane
 * Date: 10-24-25
 * 
 * Description: Represents a single student at SFSU. The student should have a first 
 *              and last name, a student id, a gpa, and numbers of small and big questions.
 *              The student class also tracks a list of priorities (ways of comparing
 *              the student with other students), as well as which priority is currently selected
 */

public final class Student implements Comparable<Student>
{
    // The students attributes are stored in an array, so that they can be iterated through.
    private Comparable[] attributes;

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
        // The attribute at index 0 is the last letter of the students last name.
        attributes = new Comparable[] {lastName.charAt(lastName.length()-1), firstName, lastName, id, gpa, numSmallQuestions, numLargeQuestions, numSmallQuestions + numLargeQuestions};
    }

    static public String[] getPriorities() {return priorities;}

    /**
     * @param priority The attribute that the students should be compared with
     * @throws InvalidParameterException If the given priority isn't a valid option
     */
    static public void setCompareToPriority(String priority) throws InvalidParameterException
    {
        for(int i = 0; i < priorities.length; i++)
            if(priority.equals(priorities[i]))
            {
                currentPriorityIndex = i;
                return;
            }

        throw new InvalidParameterException();
    }

    @Override
    public int compareTo(Student student)
    {
        return compareAttribute(currentPriorityIndex, student);
    }

    /**
     * @param priorityIndex The priority we are using to compare
     * @param student The other student that is being compared with this student
     * @return The difference in the attribute of the two students
     */
    private int compareAttribute(int priorityIndex, Student student)
    {
        // Compare the given attribute
        int result = this.attributes[priorityIndex].compareTo(student.attributes[priorityIndex]);

        // If they are the same
        if(result == 0)
            if(priorityIndex == 0)
                //If the priority index is 0, pick a priority index based on the length of the last name
                /* 3 letters becomes index 1 priority (first-name)
                   4 letters becomes index 2 priority (last-name)
                   5 letters becomes index 3 priority (student-id)
                   Anything higher loops through those three options since we are doing mod 3 */
                return compareAttribute((((String) attributes[2]).length() % 3) + 1, student);
            else
                //Compare with the previous attribute
                return compareAttribute(priorityIndex-1, student);

        return result;
    }

    @Override
    public String toString()
    {
        // We only want to print the attributes from first-name to number-of-big-questions
        return String.format("%-10s%-10s%-10d%-3.2f%9d%8d", Arrays.copyOfRange(attributes, 1, 7));
    }
}