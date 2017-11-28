package com.lab111.labwork9.models;

public class House implements TableElement {
    private int id;
    private String name;
    private String address;

    private static int lastId = 0;

    public House(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = ++lastId;
    }

    public House() {
    }

    @Override
    public String getFieldNames() {
        return "Home.Id, Home.Name, Home.Address";
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
