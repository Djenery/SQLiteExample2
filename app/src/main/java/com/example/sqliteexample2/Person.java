package com.example.sqliteexample2;

public class Person {
    private String id;
    private String name;
    private String number;
    private byte [] image;

    public Person(String id, String name, String number, byte[] image) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.image = image;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
