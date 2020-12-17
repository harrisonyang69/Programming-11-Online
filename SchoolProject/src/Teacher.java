//This is the teacher class- the fields are firstName, lastName, and Subject. There are
//2 constructors, one that is blank and one that is called and gives the teacher values.

public class Teacher {

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    String firstName;
    String lastName;
    String subject;

    Teacher() {
        firstName = "";
        lastName = "";
        subject = "";
    }

    Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //method that shows teacher info- it returns the name of the teacher followed by his or her subject
    public String teacherInfo() {
        return "Name: " + firstName + " " + lastName + " subject: " + subject;
    }


}
