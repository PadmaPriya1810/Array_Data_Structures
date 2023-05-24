package Practice_Array;

public class _13_Smallest_Element_EASY
{
public static void main(String[] args)
{
	int[] arr= {10,50,30,80,100};
	
	int small=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(small>arr[i])
		{
			small=arr[i];
		}
	}
	
	System.out.println("Smallest Element is :"+small);
}
}
