package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private String email;
    private Integer age;
    private String name;
    private Long id;
    private LocalDate dob;

    public Student(String email, Integer age, String name, Long id, LocalDate dob) {
        this.email = email;
        this.age = age;
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    public Student(Integer age, String name, Long id, LocalDate dob) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                '}';
    }
}
