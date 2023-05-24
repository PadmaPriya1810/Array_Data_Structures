package Practice_Array;
//Check whether the given element is present in the Array or Not 
//Using BINARY SEARCH -Disadvantage: Only Applicable For Sorted Elements
//Advantage: Time Taken Less & Performance Good
//

public class _19_BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] arr= {13,20,23,45,55,71,231};//Only for Sorted Elements
		
		int key=21;//To Search
		
		int low=0,high=arr.length-1;// length-1=last Index //length=7, index=6
		
		while(high>=low)//If atleast 1 Element is there in the Array i=0
		{
		  int mid=(low+high)/2;
			
			if(key==arr[mid])
				{
					System.out.println("Present");
					break;
				}
			else if(key>arr[mid])
				{
					low=mid+1;
				}
		    else
				{
					high=mid-1;
				}
		}
			if(high<low) //if low=0, Array Empty
			{
				System.out.println("Not Present");
			}
			
	}
}
