package rvt.school_program;

public class Student extends Person{

    private String course;
    private int courseNumber;
    private int credit;
    public Student(String name, String surname, String address, String email, String course, int courseNumber, int credit) {
        super(name, surname, address, email);
        this.course = course;
        this.courseNumber = courseNumber;
        this.credit = credit;
    }
    
}
