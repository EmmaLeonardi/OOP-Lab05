package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    public int compare(String o1, String o2) {

	return Double.compare(Double.parseDouble(o1), Double.parseDouble(o2));
    }

}
