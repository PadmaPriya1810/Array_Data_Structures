package Practice_Array;
//WAJP to find Smallest Element in an Array

	import java.util.Scanner;

public class _13_SmallestElement_WO_Sorting_MethodCall {
	
		static Scanner sc=new Scanner(System.in);
		
		public static void main(String[] args)
		{
			System.out.println("Enter the Size of an Array");
			int size=sc.nextInt();//Getting Length from user
			int[] arr=new int[size];//Passing Length into Array size in Syntax
			
			System.out.println("Enter the Array Elements");
			
			for(int i=0;i<arr.length;i++)//Storing Values
			{
				arr[i]=sc.nextInt();//For Getting Array Elements From user
			}
			System.out.println("Smallest Elemenet is:" +smallest(arr));
		}
			
			public static int smallest(int[] arr)//Passing int[] Array
			{
				int small=arr[0];//Assuming arr[0]=large
				
				for(int i=1;i<arr.length;i++)//So start 'i' from 1
				{
					if(small>arr[i])
					{
						small=arr[i];
					}	
				}
				return small;
			}
	}


