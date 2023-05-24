package Practice_Array;

public class _14_LastElement
{
	public static void main(String[] args) 
	{
	int[] arr= {2,5,1,6,10,20,18};
	
	if(arr.length==0)
	{
		System.out.println("Empty Array");
	}
	else
		System.out.println(arr[arr.length-1]);// arr[index]
	}
}