 class CMD_calculator{
    public static void Addition(int n1, int n2){
    	System.out.println("Sum of"+ n1 +" and "+ n2+ "is" +(n1+n2));
    }
    public static void Subtraction(int n1, int n2){
    	System.out.println("Subtraction of"+ n1 +" and "+ n2+ "is"+( n1-n2));
    }
    public static void Multiplication(int n1, int n2){
    	System.out.println("Product of"+ n1 +" and "+ n2+ "is" +(n1*n2));
    }
    public static void Division(int n1, int n2){
    	if(n2 ==0|| n2<0 ){
    		System.out.println("Can't divide, make sure your entries are valid");
    	}
    	else
    	    System.out.println("Division of"+ n1 +" and "+ n2+ "is" +(n1/n2));
    }       
  /* if you will run this class file it will give error as
     " main method not found" as there is no main  method in this CMD_calculator class */
}
class example{
    public static void main(String[] args){
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[0]);
        CMD_calculator.Addition(n1,n2);
        CMD_calculator.Subtraction(n1, n2);
        CMD_calculator.Multiplication(n1, n2);
        CMD_calculator.Division(n1, n2);
        System.out.println("Opeartions completed!");
    }
}
