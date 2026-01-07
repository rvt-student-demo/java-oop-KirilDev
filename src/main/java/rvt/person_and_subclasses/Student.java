package rvt.person_and_subclasses;
public class Student extends Person{

    private String course;
    private int courseNumber;
    private int credit = 0;
    public Student(String name, String surname, String address, String email, String course, int courseNumber) {
        super(name, surname, address, email);
        this.course = course;
        this.courseNumber = courseNumber;
    }
    
}
