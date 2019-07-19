package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String...strings) throws Exception{
        Car car = new Car("Lexus", "RT 350", 2019);
        repository.save(car);

        car=new Car("Honda", "Accord Coup", 2002);
        repository.save(car);

        car=new Car("BMW", "528 xi drive", 2014);
        repository.save(car);
    }
}
