package com.example.springboot.model;

import jakarta.persistence.*;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Size(min = 2, message = "Name size must be greater than 1")
    @NotBlank(message = "Name is required field!")
    @Column(name = "name")
    private String name;
    @Size(min = 2, message = "Surname size must be greater than 1")
    @NotBlank(message = "Surame is required field!")
    @Column(name = "surname")
    private String surname;
    @Min(value = 1, message = "Must be greater than 0")
    @Max(value = 120, message = "Must be lass than 121")
    @Column(name = "age")
    private int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
