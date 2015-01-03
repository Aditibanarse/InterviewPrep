package sorting;

public class SelectionSort 
{
	int sortedArray[];
	int nElements=0;
	
	SelectionSort(int size)
	{
		sortedArray=new int[size];
		
	}
	
	/*
	 * Insert
	 */
	public void insert(int value)
	{
		sortedArray[nElements]=value;
		nElements++;
	}
	
	
	/*
	 * Sort
	 */
	public void selectionSort()
	{
		int pointer=0, min, loopVar;
		for(loopVar=0;loopVar<nElements-1;loopVar++)
		{
			min=loopVar;
			//find the minimum element
			for(pointer=loopVar+1;pointer<nElements;pointer++)
				if(sortedArray[pointer]<sortedArray[min])
						min=pointer;
			swap(loopVar,min);

		}
	
		

	}
	
	/*
	 * Swap
	 */
	public void swap(int out,int in)
	{
		int min=sortedArray[in];
		sortedArray[in]=sortedArray[out];
		sortedArray[out]=min;
		display();
		
	}

	/*
	 * Display
	 */
	public void display()
	{
		for(int i=0;i<nElements;i++)
			System.out.print(sortedArray[i]+" ");
		System.out.println();
	}

}
