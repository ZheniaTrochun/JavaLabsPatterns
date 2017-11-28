package com.lab111.labwork9.models;

public class Human implements TableElement {
    private int id;
    private String name;
    private int age;

    private static int lastId = 0;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++lastId;
    }

    public Human() {
    }

    public String getFieldNames() {
        return "Human.Id, Human.Name, Human.Age";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
