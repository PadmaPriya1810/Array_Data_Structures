package Practice_Array;

import java.util.Scanner;

public class _06_Position_Index_Of_KeyElement
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,3,1,5,2,3};
		
		System.out.println("Enter the Key Element");
		int key=sc.nextInt();
		
		System.out.println("Position is ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.print(i+" ");
			}
		}
}
}