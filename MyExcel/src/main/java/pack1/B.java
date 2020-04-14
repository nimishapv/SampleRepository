package pack1;

import java.io.IOException;

public class B {

	
			public static void main(String[] args) throws IOException {
			 A ob= new A();

			 String a=ob.readData(0,0);
		        System.out.println("Value of a is "+a);
		        
		        String b=ob.readData(0,1);
		        System.out.println("Value of b is "+b); 

			}




	}


