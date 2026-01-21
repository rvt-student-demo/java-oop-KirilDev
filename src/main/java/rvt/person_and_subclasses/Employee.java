package rvt.person_and_subclasses;

public class Employee extends Teacher{

    private String role;
    private String timeOpportunity;
    private String workingHours;
    public Employee(String name, String address, int salary, String role, String timeOpportunity, String workingHours) {
        super(name, address, salary);
        this.role = role;
        this.timeOpportunity = timeOpportunity;
        this.workingHours = workingHours;
    }
    
    @Override
    public String toString(){
        return super.toString() 
        + "\n Role: " + this.role 
        + "\n Commitment: " + this.timeOpportunity 
        + "\n Working hours: " + this.workingHours;
    }
}
