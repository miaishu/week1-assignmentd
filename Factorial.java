package week1.day1;

public class Factorial {
	
	//Factorialof 5 = 1*2*3*4*5
	//For multiplication,consider initial value(fact- to be 1 & sum it is 0).
	
	public static void main(String[] args) {
		// declaring variables
		int i;
		int number=5;
		int fact=1;
		//for loop
		for (i =1;i<=number; i++) {
			
			fact= fact*i;
		}
		System.out.println("Factorial of" +number+ "is:"+fact);
	}

}
