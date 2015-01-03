package sorting;

/*
 * main class highArray.java
 */
public class BinarySearch {
	
	int nElements=0;
	int arr[];
	
	BinarySearch(int size)
	{
		arr=new int[size];
	}
	/*
	 * Insertion
	 * Ordered array. Correct position has to be found before inserting
	 */
	public void insert(int value)
	{
		int i;
		if(nElements==0)
		{
			arr[nElements]=value;
			nElements++;
		}
		else
		{
		for(i=0;i<nElements;i++)
		{
			if(arr[i]>value)
			{System.out.println("Value of i "+i);
				break;
			}
			
		}
		for(int k=nElements;k>i;k--)
		{
			arr[k]=arr[k-1];
		}
		arr[i]=value;
		nElements++;
		}
	}
	
	/*
	 * Search
	 */
	public int search(int value)
	{
		int low=0;
		int high=nElements;
		int mid;
		while(true)
		{
			mid=(low+high)/2;
			if(arr[mid]==value)
				return mid;
			else if(low>high)
				return nElements;
			else
			{
			if(arr[mid]>value)
				high=mid-1;
			if(arr[mid]<value)
				low=mid+1;	
			}
			
		}
		
	}
	
	
	/*
	 * Deletion
	 */
	public boolean delete(int value)
	{
		//Searching the number
		int j=search(value);
		if(j==nElements)
			return false;
		else
		{
			for(int k=j;k<nElements;k++)
			{
				arr[k]=arr[k+1];
				
			}
			nElements--;
		return true;
		}
		
	}
	
	public void display()
	{
		for(int i=0;i<nElements;i++)
			System.out.print("| "+arr[i]+" | ");
		System.out.println();
	}


}
