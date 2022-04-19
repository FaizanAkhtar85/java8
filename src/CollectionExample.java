import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionExample {
	@FunctionalInterface
	interface NewOne{
		public abstract String showCase();
		//public abstract String showCase1();
		default String showCase2() {
			return "HI";
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(10);
		al.add(26);
		al.add(30);
		al.add(0);
		System.out.println(al);
		Comparator<Integer> c = (I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0;
		Collections.sort(al, c);
		System.out.println(al);
		al.stream().forEach(System.out::println);
		List<Integer> al1 = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(al1);
		System.out.println();
		List<String> asList = Arrays.asList("Faizan","Tas","Pas","Asjg","Tanvir");
		List<String> collect = asList.stream().filter(p-> !(p.startsWith("F"))).collect(Collectors.toList());
		collect.forEach(m->System.out.println(m));
		NewOne newOne=()-> {
				return "Hello World!!!";		
		};
		System.out.println(newOne.showCase()+" "+newOne.showCase2());
	}

}
