package Practice_Array;

public class _12_Largest_Element_MethodCall 
{
	public static void main(String[] args)
	{
		int[] arr= {1,18,03,28,15,04};
		System.out.println(largest(arr));//Method Call
	}

public static int largest(int[] arr)//Accepts int[] array
{
	int large=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(large<arr[i])
		{
			large=arr[i];
		}
	}
	return large;
}
}
