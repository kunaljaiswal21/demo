package numbers;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int n = sc.nextInt();
		int temp = n;
		
		while(n != 0) {
			rem = n % 10;
			rev = rev*10 + rem;
			n = n / 10;
		}
		
		if(temp == rev)
			System.out.println(temp+" is a palindrome no. ");
		
		else
			System.out.println(temp+" is not a palindrome no. ");
		
	}

}
