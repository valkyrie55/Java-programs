public class String_concat {

	public static void main(String[] args) {
		String s1 ="hey";
		String s2 = new String("there");
		String s3 = s1.concat(s2);
		//s1 = s1.concat("there");
		System.out.println(s3);
	}
}
