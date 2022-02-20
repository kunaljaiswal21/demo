package numbers;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1 = 0, fib2=1, fib3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int n = sc.nextInt();
		System.out.println("Fibonacci series ---> ");
		System.out.print(fib1+" "+fib2+" ");
		for(int i=1; i<=n; i++) {
			fib3=fib1+fib2;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
		}

	}

}
