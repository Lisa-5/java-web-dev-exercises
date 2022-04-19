package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        int comparator = 0;
        if (o1.getCost() - o2.getCost() > 0) {
            comparator = 1;
        } else if (o1.getCost() - o2.getCost() < 0) {
            comparator = -1;
        } else if (o1.getCost() - o2.getCost() == 0) {
            comparator = 0;
        }
        return comparator;
        //return o1.getCost().compareTo(o2.getCost());
    }
}
