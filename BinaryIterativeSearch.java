public class BinaryIterativeSearch implements Practice03Search {
	
	public int search(int [] arr, int toCheck) 
	{ 
		int start = 0;
		int end  = arr.length - 1; 
			while (end >= start ) { 
		int mid = start + (end - start) / 2; 
			if (arr[mid] == toCheck) 
				return mid; 
			if (arr[mid] < toCheck) 
				start = mid + 1; 
			else
				end = mid - 1; 
		} 
			return -1; 
	} 

	public String searchName(){
		return "binary-iterative";
	}
}

