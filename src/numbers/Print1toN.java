package numbers;

import java.util.Scanner;

public class Print1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}

	}

}
