import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDB {
	public static List<Customer> getAllCustomers(){
		return Stream.of(
				new Customer("Alex", "hill@gmail.com"),
				new Customer("Nadeem", "ahmad@yahoo.com"),
				new Customer("naushad", "ahmad@yahoo.com"),
				new Customer("panjwani", "panjwani@yahoo.com")
				).collect(Collectors.toList());
	}
}
