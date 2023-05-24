package Practice_Array;

//WAJP To Check if the Number is EVEN -1 or ODD +1 in the given Array
public class _17_EvenOddNumberWithLogic {
	
	public static void main(String[] args) {
	
	int[] arr={1,3,8,11,21,20,22,31,24};
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			arr[i]=arr[i]-1;
		}
		else
			arr[i]=arr[i]+1;
		
		System.out.print(arr[i]+" ");
	}
	
	
	}
	
}
