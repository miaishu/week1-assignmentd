package week1.day1;


public class FibonacciSeries {
	//In Fibonacci series we cannot add first 2 numbers. 0,1,1,2,3,5,7,12,..

	public static void main(String[] args) {
		
		int firstNumber=0;
		int secondNumber=1;
		int sum;
		//rangeto be requested/ advised by user
		int range=8;
		//its must print the first 2 numbers here,we can add from 3no.
		System.out.println(firstNumber);
		System.out.println(secondNumber);
	
		
		for (int i=1;i<=6;i++) {
			//i is to run the number of times. not for calculations in this program.
					
			sum=firstNumber+secondNumber;
			
			System.out.println(sum);
			//swap
			
			firstNumber=secondNumber;
				
			secondNumber=sum;
			
		
				
		}	
		}

}
