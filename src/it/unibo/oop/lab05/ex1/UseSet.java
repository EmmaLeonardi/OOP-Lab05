package it.unibo.oop.lab05.ex1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args ignored
     */
    public static void main(final String[] args) {
	/*
	 * Considering the content of "UseCollection, write a program which, in order:
	 * 
	 * 1) Builds a TreeSet containing Strings
	 * 
	 * 2) Populates such Collection with all the Strings ranging from "1" to "20"
	 * 
	 * 3) Prints its content
	 * 
	 * 4) Removes all those strings whose represented number is divisible by three
	 * 
	 * 5) Prints the content of the Set using a for-each costruct
	 * 
	 * 6) Verifies if all the numbers left in the set are even
	 */
	final Collection<String> coll = new TreeSet<>();
	for (int i = 1; i < 21; i++) {
	    coll.add(Integer.toString(i));
	}
	System.out.println(coll.toString());
	final Iterator<String> it = coll.iterator();
	while (it.hasNext()) {
	    if (Integer.parseInt(it.next()) % 3 == 0) {
		it.remove();
	    }
	}
	boolean allEven = true;

	System.out.print("| ");
	for (String elem : coll) {
	    System.out.print(elem + " | ");
	    if (Integer.parseInt(elem) % 2 == 1) {
		allEven = false;
	    }
	}
	System.out.println();
	System.out.println("Are all the remaining elements even? " + allEven);
    }
}
