package Practice_Array;

import java.util.Scanner;

public class _09_DeleteElement_SpecifiedIndex_EASY
{
static Scanner sc=new Scanner(System.in);
public static void main(String[] args) 
{
	int[] arr= {1,2,3,4,5};
	
	System.out.println("Enter the Element's Index to Delete");
	int index=sc.nextInt();
	
	
	int[] newarr=new int[arr.length-1];
	
	
	for(int i=0,j=0;i<arr.length;i++)
	{
		if(i!=index)//Condition to Print Except Specified Index
		{
			newarr[j++]=arr[i];//Skipping the One index Element to Remove
		}
	}
	
	//TO PRINT NEWARRAY
	for(int i=0;i<newarr.length;i++)
	{
		System.out.println(newarr[i]);
	}
}

}