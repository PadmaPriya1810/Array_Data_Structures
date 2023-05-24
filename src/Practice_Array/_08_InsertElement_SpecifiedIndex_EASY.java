package Practice_Array;

import java.util.Scanner;

public class _08_InsertElement_SpecifiedIndex_EASY {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		
		int[] newarr=new int[arr.length+1];
		
		System.out.println("Enter the Element to Insert");
		int element=sc.nextInt();
		
		System.out.println("Enter the Index");
		int index=sc.nextInt();
		
		if(index<newarr.length)
		{
		  for(int i=0;i<newarr.length;i++)
		  {
			  if(i<index)//if index-Directly give "index" ,if position use "pos-1"
			  {
				  newarr[i]=arr[i];
			  }
			  else if(index==i)
			  {
				  newarr[i]=element;
			  }
			  else 
				  newarr[i]=arr[i-1]; 
		  }
		}
		else
		{
			System.out.println("Invalid Index");
		}
		   
		for(int i=0;i<newarr.length;i++)
		   {
			   System.out.println(newarr[i]);
		   }
	}
}
