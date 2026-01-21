package rvt.person_and_subclasses;
public class Student extends Person{

    private int credit = 0;
    private String course;
    public Student(String name, String address, String course) {
        super(name, address);
        this.course = course;
    }
   public int credits(){
    return this.credit;
    }
    public String course(){
    return this.course;
    }
    
    public void study(){
        this.credit++;
    }

    @Override
     public String toString(){
        return super.toString()
        + "\n  Course: " + this.course
        + "\n  Study credits " + this.credit ;
    }
}