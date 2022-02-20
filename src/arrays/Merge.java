package arrays;

import java.util.Scanner;

/*WAP to merge two arrays*/

public class Merge {
	
	static void display(int arr[]) {
		System.out.println("Array elements --->");
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array 1: ");
		int[] arr1 = new int[sc.nextInt()];
		System.out.println("Enter array 1 elements ---> ");
		for(int i=0; i<arr1.length; i++)
			arr1[i] = sc.nextInt();
		
		System.out.println("Enter size of array 2: ");
		int[] arr2 = new int[sc.nextInt()];
		System.out.println("Enter array 2 elements ---> ");
		for(int i=0; i<arr2.length; i++)
			arr2[i] = sc.nextInt();
		
		System.out.println("array 1 ---> ");
		display(arr1);
		
		System.out.println();
		System.out.println("array 2 ---> ");
		display(arr2);
		
		int size = arr1.length+arr2.length;
		int[] arr3 = new int[size];
		
		int j = 0;
		for(int i=0; i<arr3.length; i++)
		{
			if(i < arr1.length)
				arr3[i] = arr1[i];
			
			else
				arr3[i] = arr2[j++];
		}
		
//		for(int i=0; i<arr1.length; i++)
//			arr3[i] = arr1[i];
//		
//		int j = 0;
//		for(int i=arr1.length; i<arr3.length; i++)
//		{
//			arr3[i] = arr2[j++];
//		}
			
		System.out.println();
		System.out.println("array 3 ---> ");
		for(int i=0; i<arr3.length; i++)
			System.out.print(" "+arr3[i]);


	}

}
