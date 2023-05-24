package Practice_Array;

import java.util.Scanner;

public class _10_BubbleSort_Ascending {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter The Array Size");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		//TO ENTER ELEMENTS
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=sc.nextInt();
		}
		
		//LOGIC FOR ASCENDING ORDER
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])    //>
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	  //TO PRINT SORTED ARRAY
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
