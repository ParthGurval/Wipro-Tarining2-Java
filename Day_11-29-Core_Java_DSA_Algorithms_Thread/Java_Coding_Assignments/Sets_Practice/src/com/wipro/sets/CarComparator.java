package com.wipro.sets;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {
        String s1 = c1.toString();
        String s2 = c2.toString();
        return s1.compareTo(s2); // Reverse order: -s1.compareTo(s2);
    }
}
