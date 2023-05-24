package Practice_Array;

import java.util.Scanner;

public class _03_Insert_Element_In_SpecifiedIndex 
{
static Scanner sc=new Scanner(System.in);
public static void main(String[] args) 
{
	int[] arr= {1,2,3,4,5};
	
	int[] newarr=new int[arr.length+1];//Remember
	
	System.out.println("Enter the Element to Insert");
	int element=sc.nextInt();
	
	System.out.println("Enter the Index");
	int index=sc.nextInt();
	
	if(index<arr.length)
	{
	  for(int i=0;i<newarr.length;i++)
	  {
		  if(i<index)//index-1 ,if position use pos-1, else index
		  {
			  newarr[i]=arr[i];
		  }
		  else if(index==i) //exact index
		  {
			  newarr[i]=element;
		  }
		  else 
			  newarr[i]=arr[i-1]; //Remember
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
