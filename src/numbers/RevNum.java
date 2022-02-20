package numbers;

import java.util.Scanner;

/*Write a program to REVERSE the number*/

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int n = sc.nextInt();
		int rem,rev=0;
		
		while(n>0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		
		System.out.println("reverse: "+rev);
	}

}
