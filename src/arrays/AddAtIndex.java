package arrays;

import java.util.Scanner;

/*Write a program to INSERT A ELEMENT INTO EXISTING ARRAY in a
specified position*/

public class AddAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		boolean flag = false; 
		
		System.out.println("Array elements ---> ");
		for(int i=0; i<arr.length; i++)
			System.out.print(" "+arr[i]);
		
		System.out.println();
		System.out.println("Enter element: ");
		int n = sc.nextInt();
		
		System.out.println("Enter position: ");
		int pos = sc.nextInt();
		
		if(pos-1 < arr.length) {
			for(int i=arr.length-1; i>pos-1; i--)
				arr[i] = arr[i-1];
			
			arr[pos-1] = n;
			System.out.println(" element "+n+" is added at position "+pos);
		}
		
		else
			System.out.println("position out of range!");
		
		System.out.println();
		System.out.println("Array elements ---> ");
		for(int i=0; i<arr.length; i++)
			System.out.print(" "+arr[i]);
		
	}

}
