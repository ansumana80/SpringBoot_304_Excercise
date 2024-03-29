package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Car
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    @NotNull
    @Size(min=3)
    private String make;

    @NotNull
    @Size(min=3)
    private String model;

    public Car() {
    }

    public Car(@NotNull @Size(min = 3) String make, @NotNull @Size(min = 3) String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int year;





}
