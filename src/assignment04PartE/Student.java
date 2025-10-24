package assignment04PartE;

/**
 *
 * Part E
 *
 */

public final class Student implements Comparable<Student>
{
    private String firstName;
    private String lastName;
    private int id;
    private double gpa;
    private int numSmallQuestions;
    private int numLargeQuestions;

    public Student (String firstName, String lastName, int id, double gpa, int numSmallQuestions, int numLargeQuestions)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gpa = gpa;
        this.numSmallQuestions = numSmallQuestions;
        this.numLargeQuestions =numLargeQuestions;
    }

    @Override
    public int compareTo(Student student)
    {
        //TODO Implement compareTo

        return 0;
    }
}