package com.wipro.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CarHashSetDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("Tata Cruvv");
        System.out.println(set.add("Ford Everest"));
        set.add("Chevrolet Camero");
        set.add("Honda Civic");
        set.add("Honda Civic");
        System.out.println(set.add("Ford Everest"));

        System.out.println(set);

        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            String carBrand = it.next();
            System.out.println(carBrand);
        }
    }
}

