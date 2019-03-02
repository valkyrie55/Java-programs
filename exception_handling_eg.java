//java program to print first 3 lines of a file 

import java.io.*;
public class Prac {
   public static void main(String[] args) {
	   FileReader file = new FileReader("C:\\Users\\UPES\\Pictures\\my_pages\\bao.css");
	   BufferedReader fileInput = new BufferedReader(file);
	   //print first 3 lines
	   for(int c =0;c<20;c++){
		   System.out.println(fileInput.readLine());
	   }
	   fileInput.close();
   }
}
// this code will throw an error 
/*   Output:  Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Unhandled exception type FileNotFoundException
	Unhandled exception type IOException
	Unhandled exception type IOException

	at Prac.main(Prac.java:4)
  */


//but this code will work fine

import java.io.*;
public class Prac {
   public static void main(String[] args)throws IOException {
	   FileReader file = new FileReader("C:\\Users\\UPES\\Pictures\\my_pages\\bao.css");
	   BufferedReader fileInput = new BufferedReader(file);
	   //print first 3 lines
	   for(int c =0;c<20;c++){
		   System.out.println(fileInput.readLine());
	   }
	   fileInput.close();
   }
}

/* output  body{
	background-color: #DCDCDC;
}

*/
