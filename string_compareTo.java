
public class Compareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1 ="hello";
    String s2 ="hello";
    String s3 ="meklo";
    String s4 ="hemlo";
    String s5 = "flag";
    System.out.println(s1.compareTo(s2)); //return 0
    System.out.println(s1.compareTo(s3)); //return -5
    System.out.println(s1.compareTo(s4)); // return -1 
    System.out.println(s1.compareTo(s5)); // return 2
	}

}
