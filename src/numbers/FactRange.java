package numbers;

import java.util.Scanner;

/* Write a program to find the FACTORIAL of a given RANGE of numbers */
public class FactRange {

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
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i+"! = "+calFactorial(i));
		}
	}


}
