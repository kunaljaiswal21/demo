package numbers;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 & num2: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("before swap ---> n1= "+n1+" n2= "+n2);
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("after swap ---> n1= "+n1+" n2= "+n2);


	}

}
