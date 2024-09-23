package com.wipro.sets;

import java.util.HashSet;
import java.util.Set;

public class CarSet {

    public static void main(String[] args) {

        Set<Car> set = new HashSet<Car>();

        set.add(new Car(101, "Tesla Model S", 79999));
        set.add(new Car(102, "Ford Mustang", 55999));
        set.add(new Car(103, "Chevrolet Camaro", 42999));
        set.add(new Car(104, "Dodge Charger", 52999));
        set.add(new Car(105, "Honda Civic", 23999));
        set.add(new Car(105, "Toyota Corolla", 22999));

        System.out.println(set);
    }
}

