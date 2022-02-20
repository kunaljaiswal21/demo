package arrays;

import java.util.Scanner;

/*Write a program to DELETE AN ELEMENT OF A SPECIFIED INDEX IN THE
EXISTING ARRAY*/

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		boolean flag = false;
		System.out.println("Enter array elements ---> ");
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Array elements ---> ");
		for(int i=0; i<arr.length; i++)
			System.out.print(" "+arr[i]);	
		
		System.out.println("Enter element to delete: ");
		int item = sc.nextInt();
		
		for(int i=0; i<size; i++) {
			if(arr[i] == item) {
				flag = true;
				for(int j=i; j<size-1; j++) {
					arr[j] = arr[j+1];
				}
				size--;
				System.out.println("element "+item+" deleted! ");
				break;
			}
			
		}
		
		if(!flag)
			System.out.println("element "+item+" not found! ");
		
		System.out.println("Array elements ---> ");
		for(int i=0; i<size; i++)
			System.out.print(" "+arr[i]);	
		
	}

}
