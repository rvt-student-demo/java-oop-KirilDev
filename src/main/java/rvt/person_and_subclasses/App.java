package rvt.person_and_subclasses;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        Student kirill = new Student("Kirill", "private");
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        ollie.study();
        ollie.study();
        ollie.study();

        kirill.study();
        kirill.study();

        Teacher Ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher Esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 4800);
        Teacher Origo = new Teacher("Origo", "Krisjana street", 1300);

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(Ada);
        persons.add(Esko);
        persons.add(ollie);
        persons.add(kirill);
        persons.add(Origo);

        printPersons(persons);

    }
    public static void printPersons(ArrayList<Person> persons){
    for (Person person : persons){
        System.out.println(person);
    }
}
    
}


