import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

class Emp1 {
	String name;
	Double salary;

	public Emp1(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}

public class BiConsumerFI {

	public static void main(String[] args) {

		List<Emp1> l = new ArrayList<>();
		l.add(new Emp1("a", 15000.0));
		l.add(new Emp1("b", 20000.0));
		l.add(new Emp1("c", 25000.0));
		l.add(new Emp1("d", 30000.0));

		BiConsumer<Emp1, Double> bfi = (e, d) -> e.salary += d;
		for (Emp1 e : l) {
			bfi.accept(e, 500.0);
		}
		for (Emp1 e1 : l) {
			System.out.println(e1.name + ":" + e1.salary);
		}
	}
}
