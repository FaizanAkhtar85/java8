/*import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface I{
	default void show() {
		System.out.println("hello java 8");
	}
	void show(int i);
	//void print(String name);
	static void print() {
		System.out.println("static method");
	}
}
class C implements I{
	public void call(){
		System.out.println();
	}
	public void show(){
		System.out.println("hi");
	}
}

class ConsImp implements Consumer<Integer>{

	public void accept(Integer i) {
		System.out.println("hello java   "+i);
	}
}


public class Java8_Features {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(0,3,6,5,8,7);
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();	
		for(int i:l) {
			System.out.print(i+" ");		
		}
		System.out.println();
		l.forEach(i->System.out.print(i+" "));

		I obj=new I() {
			public void show(){
				System.out.println("hello hhh");
			}
		};
		obj.show();

			I obj=i->System.out.println("hello  "+i);
		obj.show(85); 

		Consumer<Integer> c=new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.print(i+" ");

			}
		};

	//	Consumer<Integer> c=i->System.out.print(i+" ");


		//l.forEach(i->System.out.print(i+" "));		
		l.forEach(System.out::println);

	}
}
 */

interface Parser{
	public String parser(String str);

}
class StringParser{
	public static String convert(String s) {
		if(s.length()<=3) {
			s=s.toLowerCase();
		}
		else {
			s=s.toUpperCase();
		}
		return s;
	}
}

class MyPrinter{
	public void print(String str,Parser p) {
		str=p.parser(str);
		System.out.println(str);
	}
}

class Java8_Features{
	public static void main(String[] args) {

		String str="Faizan Akhtar";
		MyPrinter mp=new MyPrinter();
		/*mp.print(str, new Parser() {
			public String parser(String str) {
				return StringParser.convert(str);
			}
		});*/

		//mp.print(str,(s)->StringParser.convert(str));
		mp.print(str,StringParser::convert);
	}
}