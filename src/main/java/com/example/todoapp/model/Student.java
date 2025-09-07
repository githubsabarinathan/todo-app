package com.example.todoapp.model;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int maths;
    private int science;
    private int english;

    public int getTotal() {
        return maths + science + english;
    }

    public double getAverage() {
        return (maths + science + english) / 3.0;
    }

    // getters and setters
}
