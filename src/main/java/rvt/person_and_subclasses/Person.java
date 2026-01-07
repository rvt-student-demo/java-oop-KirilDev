package rvt.person_and_subclasses;

public class Person {
    private String name;
    private String surname;
    private String address;
    private String email;

    public Person(String name, String surname, String address, String email){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }
}
