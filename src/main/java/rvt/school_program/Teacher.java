package rvt.school_program;

public class Teacher extends Person {

    private String proficiency;
    public Teacher(String name, String surname, String address, String email, String proficiency) {
        super(name, surname, address, email);
        this.proficiency = proficiency;
    }
    
}
