package Practice_Array;

import java.util.Scanner;

public class _01_PrintUsing_ForEach_Loop {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=new int[5];
		
		System.out.println("Enter the Array Elements");
		
		for (int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
			
		for (int i : arr) //Using "for-each" loop //SYNTAX: for(dataType Var:arrayName)
		{
			System.out.println(i);
		}
		}
	}


