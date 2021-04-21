package basicProgram;

import java.util.Scanner;

//Program to understand Exception Handling 

public class ExceptionHandling1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		//try-catch-finally block
		
		try{
			
			System.out.println(10/0);
			
		}catch(Exception e){
			
			
			System.out.println(e);
			
		}finally{
			
			in.close();
			System.out.println("finally block Invoked\nClosing Scanner in");
		}
		
	}

}
