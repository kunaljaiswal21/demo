package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonOfThreeSorted {

	static void display(int arr[]) {
		//System.out.println("Array elements --->");
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
		
		System.out.println("Enter size of array 3: ");
		int[] arr3 = new int[sc.nextInt()];
		System.out.println("Enter array 3 elements ---> ");
		for(int i=0; i<arr3.length; i++)
			arr3[i] = sc.nextInt();
		
		System.out.println("array 1 ---> ");
		display(arr1);
		
		System.out.println();
		System.out.println("array 2 ---> ");
		display(arr2);
		
		System.out.println();
		System.out.println("array 3 ---> ");
		display(arr3);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length && k < arr3.length)
		{
			if(arr1[i] == arr2[j] && arr2[j] == arr3[k])
			{
				al.add(arr1[i]);
				i++;
				j++;
				k++;
			}
			
			else if(arr1[i] < arr2[j] )
			{
				i++;
			}
			else if(arr2[j] < arr3[k] )
			{
				j++;
			}
			else
			{
				k++;
			}
		}
		
		System.out.println();
		System.out.println("common elements ---> ");
		for(int n: al)
			System.out.print(" "+n);

	}

}
