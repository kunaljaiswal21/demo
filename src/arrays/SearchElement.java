package arrays;

import java.util.Scanner;

public class SearchElement {
	
	static void display(int arr[]) {
		System.out.println("Array elements --->");
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

	static int search(int arr[], int n) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == n )
				return i+1;
		}
		return -1;
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
		
		System.out.println("Enter element to search");
		int item = sc.nextInt();
		int index = search(arr, item);
		
		if(index == -1)
			System.out.println("elemet not found!");
			
		else
			System.out.println("element "+item+" found at position "+index);
		
		
	}

}
