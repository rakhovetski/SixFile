package org.example;

import java.util.Objects;

public class Human {
    private String surname;
    private String name;
    private String patronymic;
    private int age;

    public Human(String surname, String name, String patronymic, int age){
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Human(Human h){
        this.age = h.getAge();
        this.name = h.getName();
        this.surname = h.getSurname();
        this.patronymic = h.getPatronymic();
    }

    public String getName() {
        return name;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String
    toString() {
        return "Human{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(surname, human.surname) && Objects.equals(name, human.name) && Objects.equals(patronymic, human.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic, age);
    }
}
