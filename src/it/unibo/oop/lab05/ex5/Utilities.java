package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */
public final class Utilities {

	private Utilities() {
	}

	/**
	 * @param setA a set
	 * @param setB another set
	 * @param <X>  Returned collection type
	 * @return a new set that is the union of the input sets.
	 */
	public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
		Set<X> s = new TreeSet<X>(setA);
		for (X elem : setB) {
			s.add(elem);
		}
		return s;
	}

	/**
	 * @param setA a set
	 * @param setB another set
	 * @param <X>  Returned collection type
	 * @return a new set that is the intersection of the input sets.
	 */
	public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
		Set<X> s = new TreeSet<X>();
		for (X elem : setA) {
			if (setB.contains(elem)==true) {
				s.add(elem);
			}
		}
		return s;
	}

	/**
	 * @param setA a set
	 * @param setB another set
	 * @param <X>  Returned collection type
	 * @return a new set that is the symmetric difference of the input sets.
	 */
	public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
		Set<X> uni = setUnion(setA, setB);
		Set<X> inter = setIntersection(setA, setB);
		for (X elem : inter) {
			uni.remove(elem);
		}
		return uni;
	}

	/**
	 * @param coll the collection
	 * @param <X>  collection type
	 * @return a random element from the collection
	 *
	 */
	public static <X> X getRandomElement(final Collection<X> coll) {
		var r=new Random();
		int num=r.nextInt(coll.size());
		int i=0;
		for(X elem: coll) {
			if(i==num) {
				return elem;
			}
			i++;
		}
		return null;
	}

	/**
	 * @param first  first collection
	 * @param second second collection
	 * @param <X>    First collection type
	 * @param <Y>    Second collection type
	 * @return a pair with two random elements
	 */
	public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
		return new Pair <X,Y> (getRandomElement(first), getRandomElement(second));
	}
}
