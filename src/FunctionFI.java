import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

class Emp {
	int id;
	String name;

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class FunctionFI {

	public static void main(String[] args) {
		Function<Integer, Integer> f = (a) -> a * a;
		System.out.println(f.apply(10));

		BiFunction<Integer, String, Emp> bf = (id, name) -> new Emp(id, name);
		List<Emp> l = new ArrayList<>();
		l.add(bf.apply(101, "faizan"));
		l.add(bf.apply(102, "Gaurav"));
		l.add(bf.apply(103, "Ishrat"));
		for (Emp e : l) {
			System.out.println(e.id + ":" + e.name);
		}
	}
}
