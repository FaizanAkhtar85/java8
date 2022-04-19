import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	
	public static Customer getCustomerByEmail(String email) throws Exception {
		List<Customer> customers = CustomerDB.getAllCustomers();
		return customers.stream()
		.filter(customer -> customer.getEmail().equals(email))
		.findAny().orElseThrow(()->new Exception("No customer with this email address"));
	
	}
	

	public static void main(String[] args) throws Exception {
		Customer customer=new Customer("Faizan", "faizanakhtar35@gmail.com");
		Optional<Object> empty = Optional.empty();
		System.out.println(empty);
		/*
		 * Optional<String> of = Optional.of(customer.getEmail());
		 * System.out.println(of);
		 */Optional<String> ofNullable = Optional.ofNullable(customer.getEmail());
		 //System.out.println(ofNullable);
		 //System.out.println(ofNullable.get()); // java.util.NoSuchElementException
			/*
			 * if(ofNullable.isPresent()) System.out.println(ofNullable.get());
			 */ 
		 //System.out.println(ofNullable.orElse("defalut@gmail.com"));
		 //System.out.println(ofNullable.orElseThrow(()->new IllegalArgumentException("email is not present")));
		 //System.out.println(ofNullable.map(String::toUpperCase).orElseGet(()->"default email..."));
		 System.out.println(OptionalDemo.getCustomerByEmail("hill@gmail.com"));
	
	}

}
