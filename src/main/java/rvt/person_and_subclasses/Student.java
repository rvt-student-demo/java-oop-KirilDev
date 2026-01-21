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

     public String toString(){
        return super.toString()+"\n  Study credits "+ this.credit;
    }
}