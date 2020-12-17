//The student class consists of 4 fields, the firstName, lastName, Grade, and Student Number
//There are two constructors, one blank and one that receives a value.
public class Student {

    //the getters and setters are used to get and set values for each of these things
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    String firstName;
    String lastName;
    int grade;
    int studentNumber;

    Student() {
        firstName = "";
        lastName = "";
        grade = 0;
        studentNumber = 0;
    }

    Student(String firstName, String lastName, int grade, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = studentNumber;
    }

    //method that shows student info- it returns the name followed by the student's grade
    public String studentInfo() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade;
    }



}
