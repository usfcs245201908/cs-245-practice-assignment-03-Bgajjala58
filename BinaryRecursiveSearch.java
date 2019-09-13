public class BinaryRecursiveSearch implements Practice03Search {
	
	public int search(int[] arr, int toCheck) {
		int start = 0;
		int end = arr.length -1;
		return Binarysearch(arr, start, end, toCheck);
	}
		public int Binarysearch(int[] arr, int start, int end, int toCheck)
		{
			if (end >= start) 
			{ 
				int mid = start + (end - start) / 2; 
				if (arr[mid] == toCheck) 
					return mid;
				if (arr[mid] > toCheck) 
					return Binarysearch(arr, mid+1, end, toCheck); 
				if (arr[mid] < toCheck)
				{
				return Binarysearch(arr, mid-1, start, toCheck);
				}
			}
				return -1; 
		} 

		public String searchName(){
			
		return "binary-recursive";
	}

		
	}