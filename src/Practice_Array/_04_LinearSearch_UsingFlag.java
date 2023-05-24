package Practice_Array;

import java.util.Scanner;

public class _04_LinearSearch_UsingFlag {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr= {5,10,15,20,25,15};
		System.out.println("Enter the Key Element to Search");
		int key=sc.nextInt();
		
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==key)
			{
				flag=true;
			}
		}
		if(flag==true)
		{
			System.out.println("Present");
		}
		else
			System.out.println("Not Present");
	}

}
