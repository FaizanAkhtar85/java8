import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Java8Handson {

	public static void main(String[] args) throws Exception {
		List<String> list = Stream.of("faizan","faizan","nazeeb","farooq","ajmal").collect(Collectors.toList());
		String orElseThrow = list.stream().filter(str->str.length()==6).findAny().orElseThrow(()->new RuntimeException());
		System.out.println(orElseThrow);
	}
}