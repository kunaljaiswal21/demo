package numbers;

import java.util.Scanner;

public class Factorial {
	
	static int calFactorial(int n) {
		
		int fact = 1;
		
		if(n == 0)
			return 0;
		
		else {
			for(int i=n; i>0; i-- ) {
				fact = fact * i;
			}
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		System.out.println("Factorial: "+calFactorial(sc.nextInt()));
	}

}
