public class Main {
    public static void main(String[] args) {

        School sc = new School();
        sc.addStudent("Harrison Yang");
        sc.addStudent("John Doe");
        sc.addStudent("Jason Morales");
        sc.addStudent("Peter Ou");
        sc.addStudent("Ester Lo");
        sc.addStudent("Anna Pan");
        sc.addStudent("Tristan Regan");
        sc.addStudent("Kyle Liu");
        System.out.println(sc.showStudent());

        sc.addTeacher("Paul Zaremba");
        sc.addTeacher("Joe Makin");
        sc.addTeacher("Chris Tsang");
        System.out.println(sc.showTeacher());

        sc.removeStudent();
        sc.removeStudent();
        System.out.println(sc.showStudent());

        sc.removeTeacher();
        System.out.println(sc.showTeacher());


    }
}
