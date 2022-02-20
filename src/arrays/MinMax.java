package arrays;

import java.util.Scanner;

/*Write a program to find BIGGEST AND SMALLEST ELEMENT in the given
array*/
public class MinMax {

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
		
		System.out.println("Enter array elements ---> ");
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		
		display(arr);
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min ) {
				min = arr[i];
			}
			
			if(arr[i] > max ) {
				max = arr[i];
			}
		
		}
		System.out.println();
		System.out.println("Min = "+min);
		System.out.println("Max = "+max);

	}

}
