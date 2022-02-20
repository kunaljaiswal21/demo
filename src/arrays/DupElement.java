package arrays;

import java.util.Scanner;

/*Write a program to Duplicate ELEMENT in a given array*/

public class DupElement {
	static void display(int arr[]) {
		System.out.println("Array elements --->");
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int[] arr = new int[sc.nextInt()];
		boolean flag=false;
		System.out.println("Enter array elements ---> ");
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		
		display(arr);
		
		System.out.println();
		System.out.println("Dup elements ---> ");
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if((arr[i]==arr[j]) && (i!=j)) {
					System.out.print(" "+arr[i]);
					flag=true;
				}
			}
		}
		
		if(!flag)
			System.out.println("No Dup elements found!");
		
	}

}
