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

    static private String currentPriority;
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
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gpa = gpa;
        this.numSmallQuestions = numSmallQuestions;
        this.numLargeQuestions =numLargeQuestions;
    }

    static public String[] getPriorities() {return priorities;}

    static public void setCompareToPriority(String priority) {currentPriority = priority;}

    @Override
    public int compareTo(Student student)
    {
        //TODO Implement compareTo

        return 0;
    }
}