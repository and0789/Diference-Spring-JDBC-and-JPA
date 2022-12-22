package com.itc.jdbctojpa.entity;

import jakarta.persistence.*;

import java.util.Date;


// jika nama tabel sama dengan nama kelas tidak usah di definisikan
// @Table(name = "person")
@Entity // medefinisikan bahwa ini adalah sebuah entitas yang akan jadi tabel
@NamedQuery(name = "find_all_persons", query = "select p from Person p")
public class Person {

    @Id // menyatakan sebagai id
    @GeneratedValue // untuk membuat id secara otomatis
    private int id;

    private String name;
    private String location;
    private Date birthDate;

    public Person(int id, String name, String location, Date birthDate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public Person(String name, String location, Date birthDate) {
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public Person() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
