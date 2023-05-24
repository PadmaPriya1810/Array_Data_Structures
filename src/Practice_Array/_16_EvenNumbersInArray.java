package Practice_Array;

//WAJP To Find the Even Numbers in an Array

import java.util.Scanner;

public class _16_EvenNumbersInArray {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		//TO Create An Array
		int[] arr=new int[5];

		
		System.out.println("Enter the Array Elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//Logic For Even Numbers
		System.out.println("\n Even Numbers in the Array are:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
}
}