// 1. By user defined function
public class String_prac{
public static int StringCompare(String s1, String s2){
    int l1 = s1.length();
	int l2 = s2.length();
	int min = Math.min(l1,l2);
	for(int i=0;i<min;i++){
		int a = (int)s1.charAt(i);
		int b = (int)s2.charAt(i);
		if(a !=b)
			return a-b;
		
	}
	if( l1!=l2)
		return l1-l2;
	else
		return 0;
	
}
public static void main(String args[]){
	//create the strings in heap
	String str1 = new String("Geekse");
	String str2 = new String("Geeksa");
	String str3 = new String("Geeksforgeeks");
	String str4 = new String("Geeksforgeeks");
	
	
	//compare
	System.out.println("Comparing"+str1+"and"+str2+":"+StringCompare(str1,str2));
	System.out.println("Comparing"+str3+"and"+str4+":"+StringCompare(str3,str4));
	System.out.println("Comparing"+str1+"and"+str4+":"+StringCompare(str1,str4));
	
}
}
