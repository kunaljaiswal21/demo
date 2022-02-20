package arrays;

import java.util.Scanner;

public class CommonOfTwo {

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
		
		boolean flag = false;
		
		System.out.println();
		System.out.println("Common elements --->");
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.print(" "+arr1[i]);
					flag = true;
				}
			}
		}
		
		System.out.println();
		if(!flag)
			System.out.println("no common elements found!");

	}

}
