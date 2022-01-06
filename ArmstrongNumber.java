package week1.day2;

public class ArmstrongNumber {
	

	public static void main(String[] args) {
		
		int total=153;//1*1*1+5*
		int reminder;
		int calculated=0;
		int org=total;
		
		
		
		
		while(total>0) {
			
			reminder=total%10;//3,5
			calculated = calculated + (reminder*reminder*reminder);//3+5
			total=total/10;//15,1
		}
							
			if(calculated == org) {
				System.out.println("it is an Armstrong number"+" "+calculated );
				
			}else
			{
				System.out.println("it is not an Armstrong"+" "+calculated);
			}
				
			
		}
		
}
	