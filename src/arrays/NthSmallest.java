package arrays;

import java.util.Scanner;

/*Write a program to find Nth highest element in given array*/

public class NthSmallest {

	static void display(int arr[]) {
		System.out.println("Array elements --->");
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
	static void sort(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
			}
		}
		System.out.println("elements sorted!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Enter array elements ---> ");
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		
		sort(arr);
		display(arr);
	
		System.out.println();
		System.out.println("enter N: ");
		int n = sc.nextInt();
		
		if((n-1) > arr.length || n <= 0 )
			System.out.println("out of range!");
		
		else
			System.out.println("Output: "+arr[n-1]);
	}

}
