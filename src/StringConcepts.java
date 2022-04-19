
public class StringConcepts {

	public static void main(String[] args) {
		String s1=new String("faizan");
		String s2=new String("faizan");
		String s3="faizan";
		String s4="Akhtar";
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
		System.out.println();
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);


	}

}
