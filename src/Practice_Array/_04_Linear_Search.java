package Practice_Array;

import java.util.Scanner;

public class _04_Linear_Search 
{
static Scanner sc=new Scanner(System.in);

public static void main(String[] args) 
{
	int[] arr= {1,2,3,4,5,3,1,5,2,3};
	
	System.out.println("Enter the Key Element");
	int key=sc.nextInt();
	
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==key)
		{
			count++;
		}
	}	
	if(count==0)
		{
			System.out.println("Not Present");
		}
	else
		 {
			System.out.println("Present");
		 }
	}
}
