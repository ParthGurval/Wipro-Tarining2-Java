package com.wipro.sets;


import java.util.Set;
import java.util.TreeSet;

public class CarTreeExp {

    public static void main(String[] args) {

        Set<String> set1 = new TreeSet<String>();

        set1.add("Tata");
        set1.add("Ford");
        set1.add("Chevrolet");
        set1.add("Lamborghini");

        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<Integer>();
        set2.add(30000);
        set2.add(20000);
        set2.add(50000);

        System.out.println(set2);

        Set<Car> set = new TreeSet<Car>(new CarComparator());

        Car c1 = new Car(101, "Tata Curvv S", 79999);

        set.add(c1);
        set.add(new Car(104, "Lamborghini Aventador", 52999));
        set.add(new Car(105, "Honda Civic", 23999));
        set.add(new Car(102, "Ford Mustang", 55999));
        set.add(new Car(103, "Chevrolet Camaro", 42999));

        System.out.println(set);
    }
}

