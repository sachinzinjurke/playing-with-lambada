package com.bny.lambada.predicates;

public class CustomPredicateExample {

	public static void main(String[] args) {

		Predicate<String> p1 = s -> s.length() < 20;
		Predicate<String> p2 = s -> s.length() > 5;
		
		System.out.println(p1.test("sachin"));	
		System.out.println(p2.test("sachin"));
		
		Predicate<String> p3 = p1.and(p2);
		
		System.out.println("P3: for yes " + p3.test("yes"));
		System.out.println("P3 for Good Morning " + p3.test("Good Morning"));
		System.out.println("P3 for Good Morning Gentelmen " + p3.test("Good Morning Gentelmen"));
		
		Predicate<String> p4 = p1.or(p2);
		
		System.out.println("P4: for yes " + p4.test("yes"));
		System.out.println("P4 for Good Morning " + p4.test("Good Morning"));
		System.out.println("P4 for Good Morning Gentelmen " + p4.test("Good Morning Gentelmen"));
		
		Predicate<String> p5 =Predicate.isEqual("Yes");
		System.out.println("P5: for yes " + p5.test("Yes"));
		System.out.println("P5 for No " + p4.test("No"));
		
		
	}

}
