package rvt.school_program;

public class Student extends Person{

    private String course;
    public Student(String name, String surname, String address, String email, String course) {
        super(name, surname, address, email);
        this.course = course;
    }
    
}
