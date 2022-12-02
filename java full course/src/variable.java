
public class variable {
	
	
 int m = 100; // instance variable 
 static int h = 1000; //  instance variable 
 
	public static void main(String[] args) {
		variable v = new variable();
		// TODO Auto-generated method stub
		
		
		int a = 10; // Local variable  
		int b = 20; // Local variable
		boolean e = true;// local variable 
		
		
		int c = a + b;  // Addition of two local variable 
		System.out.println("c="+c); // printing of result 
		System.out.println(v.h);
		System.out.println(v.m);
		System.out.println(e);
	}

}
