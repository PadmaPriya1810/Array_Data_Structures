package Practice_Array;

import java.util.Scanner;

public class _01_Dynamic_Array 
{
	static Scanner sc=new Scanner(System.in);
	
public static void main(String[] args) 
{
	//To Get Size from User
	System.out.println("Enter the Size of an Array");
	int size=sc.nextInt();
	
	//To Create Array
	int[] arr=new int[size];
	
	//To Get Array Elements from User
	System.out.println("Enter the Array Elements");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	//To Print Array
	System.out.println("Array Elements");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
}
}
