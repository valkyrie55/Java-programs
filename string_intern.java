//intern() creates an exact copy of heap string object in string constant pool
public class Compareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s1 = new String("hello");
   String s2 ="hello";
   String s3 = s1.intern(); //returns string from pool, now it will be same as s2
   System.out.println(s1==s2); //false as reference variables are pointing to diff instanes 
   System.out.println(s2==s3); //true as reference variables are pointing to same instanes 
	}
}
