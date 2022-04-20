package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        int comparator;
        if (o1.getCost() - o2.getCost() > 0) {
            comparator = 1;
        } else if (o1.getCost() - o2.getCost() < 0) {
            comparator = -1;
        } else  {
            comparator = 0;
        }
        return comparator;

    }
}
