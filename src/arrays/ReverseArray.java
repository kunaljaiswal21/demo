package arrays;

import java.util.Scanner;

//Write a Program to REVERSE THE ELEMENTS of an array

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Enter array elements ---> ");
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Array elements ---> ");
		for(int i=0; i<arr.length; i++)
			System.out.print(" "+arr[i]);		
		
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		System.out.println();
		System.out.println(" Reverse array elements ---> ");
		for(int i=0; i<arr.length; i++)
			System.out.print(" "+arr[i]);		

	}

}
