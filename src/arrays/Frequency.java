package arrays;

import java.util.Scanner;

/*Write a program to find freq of elements in a given array*/

public class Frequency {
	static void display(int arr1[]) {
		System.out.println("Array elements --->");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(" "+arr1[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		
	
		System.out.println("Enter array elements ---> ");
		for(int i=0; i<arr1.length; i++)
			arr1[i] = sc.nextInt();
		
		display(arr1);
		
		 for(int i=0; i<arr1.length;i++)
		 {
			 int count = 1;
			 
			 if(arr1[i] != -1)
			 {
				 for(int j=i+1; j<arr1.length; j++)
				 {
					 if(arr1[i] == arr1[j])
					 {
						 count++;
						 arr1[j] = -1;
					 }
				 }
				 arr2[i] = count;
			 }
		 }
		
		System.out.println();
		for(int i=0; i<arr1.length; i++) 
		{
			if(arr1[i] != -1)
				System.out.println("Freq of "+arr1[i]+" : "+arr2[i]);
		}
		
		/*SECOND OCCURENCE of element*/
//		for(int i=0; i<arr1.length; i++) 
//			{
//				if(arr2[i] == 2)
//					System.out.println(" "+arr1[i]);
//			}
		
		
	}


}
