import java.util.Scanner;

public class labThree {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		boolean run = true;
		while (run) {
			
		System.out.println("PLease, enter a number between 1 and 100: ");
		
		int num1 = scnr.nextInt();
		
        
		if (num1 % 2 == 0 && num1 > 1 && num1 < 26) {
	         System.out.println(num1 + " and the number is even.");
		}  else if (num1 % 2 == 0 && num1  > 25 && num1 < 61) {
	         System.out.println(num1 + " and the number is even and it's larger than 25 and less than 61"); 
		}  else if (num1 % 2 == 0 && num1  > 60 && num1 < 101) {
	    	   System.out.println(num1 + " and the number is even and it's larger than 60 and less than 101");
	   	} else if (num1 % 2 != 0 && num1  > 1 && num1 < 26) {
			System.out.println(num1 + " and the number is odd.");	   
	   	} else if (num1 % 2 != 0 && num1  > 25 && num1 < 61) {
	         System.out.println(num1 + " and the number is odd and it's larger than 25 and less than 61"); }
	     else if (num1 % 2 != 0 && num1  > 60 && num1 < 101) {
	    	   System.out.println(num1 + " and the number is odd and it's larger than 60 and less than 101");
	
	     } System.out.println("Would like to enter in another number? (y/n)");
			
	    String userChoice1 = scnr.next();
		        if (userChoice1.equals("n"))
		            run = false;
		
	}
		
	}
	
	}

