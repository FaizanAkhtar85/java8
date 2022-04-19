import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	int eid;
	String ename;

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename;
	}

}

public class LE_userDefined_Class {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(10115, "faizan"));
		l.add(new Employee(42568, "tas"));
		l.add(new Employee(35698, "eon"));
		l.add(new Employee(90258, "justin"));

		System.out.println(l);
		Collections.sort(l, (e1, e2) -> (e1.eid < e2.eid) ? -1 : (e1.eid > e2.eid) ? 1 : 0);
		Collections.sort(l, (e1, e2) -> (e1.ename).compareTo(e2.ename));

		System.out.println(l);
	}

}
