package org.example;

public class Student extends Human{
    private String faculty;
    public Student(String surname, String name, String patronymic, int age, String faculty){
        super(surname,name,patronymic, age);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
