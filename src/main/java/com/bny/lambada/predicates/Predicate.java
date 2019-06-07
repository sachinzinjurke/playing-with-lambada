package com.bny.lambada.predicates;

@FunctionalInterface
public interface Predicate<T> {

	boolean test(T t);

	public default Predicate<T> and(Predicate<T> other){
		return t->test(t) && other.test(t);
	}
	public default Predicate<T> or(Predicate<T> other){
		return t->test(t) || other.test(t);
	}

	public static Predicate<String> isEqual(String string) {
		return s->s.equals(string);
	}
}
