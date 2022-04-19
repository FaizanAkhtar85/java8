import java.util.function.BiConsumer;
import java.util.function.Consumer;

class Movie {
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
}

public class ConsumerFI {
	public static void main(String[] args) {
		Consumer<Movie> c1 = m -> System.out.println(m.name);
		Consumer<Movie> c2 = m -> System.out.println(m.name);
		Consumer<Movie> c3 = m -> System.out.println(m.name);
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		Movie m = new Movie("Spiderman");
		cc.accept(m);
		/*
		 * c1.accept(m); c2.accept(m); c3.accept(m);
		 */

		
	}

}
