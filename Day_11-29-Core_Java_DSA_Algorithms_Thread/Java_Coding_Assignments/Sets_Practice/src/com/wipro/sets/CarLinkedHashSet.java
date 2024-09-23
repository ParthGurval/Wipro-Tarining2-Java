package com.wipro.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class CarLinkedHashSet {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();

        set.add("Tesla");
        System.out.println(set.add("Ford"));
        set.add("Chevrolet");
        set.add("Dodge");
        set.add("Honda");
        System.out.println(set.add("Ford"));
        set.add(null);

        System.out.println(set);
    }
}
