import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcept {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(19);
		l.add(3);
		l.add(2);
		List<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
		List<Integer> l3 = l.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(l3);
		int noOfEvenNumbers = (int) l.stream().filter(i -> i % 2 == 0).count();
		System.out.println(noOfEvenNumbers);
		List<Integer> l4 = l.stream().sorted().collect(Collectors.toList());
		System.out.println(l4);
		List<Integer> l5 = l.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println(l5);
		Integer min = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		Integer max = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(max);
		l.stream().forEach((i -> System.out.println(i * i)));
		// toArray
		Integer[] i = l.stream().toArray(Integer[]::new);
		/*
		 * for (Integer i1 : i) { System.out.println(i1); }
		 */
		Stream.of(i).forEach(System.out::println);
	}
}
