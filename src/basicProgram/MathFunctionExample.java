package basicProgram;

// program to use basic math function 
public class MathFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =10;
		int num2 = 20;
		
		//math sqrt function
		System.out.println("Square root of " + num2 + " is = " + Math.sqrt(num2));
        
		// math power function
		System.out.println("Power of " + num1 + " is = " + Math.pow(num1,2));
		
		// math mulliply function
		System.out.println(Math.multiplyExact(num1, num2));
		
		//
		System.out.println(Math.addExact(num1, num2));
		
		System.out.println(Math.subtractExact(num2, num1));
		
		System.out.println(Math.incrementExact(num1));
		
		System.out.println(Math.decrementExact(num2));
		
		System.out.println(Math.negateExact(num2));
	}

}
