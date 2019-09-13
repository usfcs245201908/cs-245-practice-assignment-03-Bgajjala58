public class LinearSearch implements Practice03Search
{
	
	public int search(int[] arr, int tocheck)
	{
		for (int i=0; i < arr.length;i++)
		{
			if (arr[1] == tocheck)
			{
				return i;

			}
		}
		return -1;
	}


	public String searchName()
	{
		
		return "linear";
	}
}