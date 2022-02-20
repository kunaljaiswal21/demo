package numbers;

import java.util.Scanner;

public class ArmstrongRange {

	static int isArmstrong(int n) {
		int r,sum=0;
		while(n>0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int n = sc.nextInt();
		
		System.out.println("Armstrong no ---> ");
		for(int i=1; i<=n; i++) {
			
			if(isArmstrong(i) == i )
				System.out.println(i);
			
		}
	
	}

}
