package launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double calculatedGPA = ....
        double qualityScore = gpa * numberOfCredits;
        int totalQualityScore =
                // Use the new course grade and course credits to update their total quality score.???

    }

    public String getGradeLevel() {
        if(Student.numberOfCredits < 30) {
            return (this.name + "is a freshman.");
        } else if(Student.numberOfCredits > 29 && Student.numberOfCredits < 60) {
            return (this.name + "is a sophomore.");
        } else if(Student.numberOfCredits > 59 && Student.numberOfCredits < 90) {
            return(this.name + "is a junior.");
        } else {
            return(this.name + "is a senior.");
        }
    }

    /* getters and setters omitted */

}