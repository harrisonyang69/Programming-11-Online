import java.util.ArrayList;

//This is the school class- there are 3 fields for the school,and 2 constructors. There are 6 methods at the bottom.
public class School {

    ////the getters and setters are used to get and set values for each of these things
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    String name;
    String location;
    int population;

    School() {
        name = "";
        location = "";
        population = 0;
    }

    School(String name, String location, int population) {
        this.name = name;
        this.location = location;
        this.population = population;
    }

        ArrayList<String> teachers = new ArrayList<>();
        ArrayList<String> students = new ArrayList<>();
        ArrayList<String> courses = new ArrayList<>();

        //this method prints the arraylist teachers and return its size
    public int showTeacher() {
        System.out.println(teachers);
        return teachers.size();
    }

    //this method adds a teachers to the arraylist teachers
    public void addTeacher(String name) {
        teachers.add(name);
    }

    //this method removes a teacher from the arraylist by deleting the last index position
    public void removeTeacher() {
        teachers.remove(teachers.size() - 1);
    }


    //this method adds a student to the arraylist
    public void addStudent(String name) {
        students.add(name);
    }

    //this method shows all the students in the arraylist students and returns the size
    public int showStudent() {
        System.out.println(students);
        return students.size();
    }

    //this method removes a student from the arraylist students by deleting the last index position
    public void removeStudent() {
        students.remove(students.size() - 1);
    }

}
