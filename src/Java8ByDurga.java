import java.util.function.Predicate;

public class Java8ByDurga {

	public static void main(String[] args) {
		/*
		 * Function<Integer, Integer> f = i -> i * i; System.out.println(f.apply(6));
		 */

		Predicate<Integer> p = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;
		System.out.println(p.and(p2).test(8));
		System.out.println(p.or(p2).test(8)); 
		System.out.println(p.negate().test(8));

		/*
		 * System.out.println(p.test(8)); Predicate<String> p1 = s -> s.length() > 5;
		 * System.out.println(p1.test("faizan"));
		 */
	}

}
