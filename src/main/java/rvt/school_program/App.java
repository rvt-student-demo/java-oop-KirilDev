package rvt.school_program;

public class App {
    public static void main(String[] args){
        Person personFirst = new Person("Kirill", "N/A", "Krišjana Valdemara", "students@rvt.lv");
        personFirst.getName();

        Student studentFirst = new Student("Nikita", "N/A", "Krišjana Valdemara", "nikita.student@rvt.lv", "Engineering", 1, 100);
        studentFirst.getName();

        Teacher teacherFirst = new Teacher(null, null, null, null, null)
        // personFirst.name = "Alex"; | Doesn't work because person field isn't visible.
    }
}
