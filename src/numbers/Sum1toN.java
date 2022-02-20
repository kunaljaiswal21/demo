package numbers;

import java.util.Scanner;

public class Sum1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=n; i>0; i--) {
			sum = sum + i;
			//System.out.println(i);
		}
		System.out.println("Sum: "+sum);

	}

}
