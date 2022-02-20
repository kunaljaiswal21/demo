package numbers;

import java.util.Scanner;

public class SumOfPrime {
	
	static boolean isPrime(int n) {
		if(n == 0 || n == 1)
			return false;
		
		for(int i=2; i<n; i++) {
			if(n%i == 0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int n = sc.nextInt();
		int sum = 0;
		System.out.println("Prime no --->");
		for(int i=1; i<=n; i++) {
			if(isPrime(i)) {
				System.out.print(" "+i);
				sum = sum + i;
			}
		}
		System.out.println("Sum of prime "+sum);
	}

}
