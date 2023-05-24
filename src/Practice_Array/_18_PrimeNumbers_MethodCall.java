package Practice_Array;

import java.util.Scanner;

public class _18_PrimeNumbers_MethodCall
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{	
	int[] arr= {1,2,3,4,5,6,7,8,9};
	
	for(int i=0;i<arr.length-1;i++)
	{
		if(isPrime(arr[i])==1)//true
		{
			System.out.println(arr[i]);
		}
	}
	}
	public static int isPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return 1;//true
		}
		else
			return 0;
		}
	}
