package Practice_Array;

import java.util.Scanner;

public class _02_Reverse_Array 
{
static Scanner sc=new Scanner(System.in);	
public static void main(String[] args) 
{
	System.out.println("Enter The Array Size");
	int size=sc.nextInt();
	
	int[] arr=new int[size];
	System.out.println("Enter the Array Elements");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Reverse Array");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
}
}
