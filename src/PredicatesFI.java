import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Employees {
	String name;
	int salary;

	public Employees(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}

public class PredicatesFI {

	public static void main(String[] args) {
		/*List<Employees> l = new ArrayList<>();
		l.add(new Employees("faizan", 17000));
		l.add(new Employees("Tas", 5000));
		l.add(new Employees("Fin", 27000));
		l.add(new Employees("Nicul", 15000));
		Predicate<Employees> p = e -> e.salary < 17000;
		
		 * Iterator<Employees> iterator = l.iterator(); while (iterator.hasNext()) {
		 * Employees employees = iterator.next(); if (p.test(employees)) {
		 * System.out.println(employees.name + ":" + employees.salary); }
		 * 
		 * }
		 

		for (Employees e : l) {
			if (p.test(e))
				System.out.println(e.name + ":" + e.salary);
		}*/

		BiPredicate<Integer, Integer> bp = (a, b) -> (a + b) % 2 == 0;
		System.out.println(bp.test(25, 35));

	}
}
