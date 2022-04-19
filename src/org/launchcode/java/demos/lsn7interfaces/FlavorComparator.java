package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

//    @Override
//    public int compare(Flavor o1, Flavor o2) {
//        return o1.getName().compareTo(o2.getName());
//    }

    @Override
    public int compare(Flavor o1, Flavor o2) {
        int allergenCount_o1 = o1.getAllergens().size();
        int allergenCount_o2 = o2.getAllergens().size();
        return o1.getAllergens().size().compareTo(o2.getAllergens().size());
        return allergenCount_o1.compareTo(allergenCount_o2);

    }

}
