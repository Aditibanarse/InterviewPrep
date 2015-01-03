package sorting;

public class InsertionSort {
	
	int array[];
	int nElements=0;
	
	InsertionSort(int size)
	{
		array=new int[size];
	}
	/*
	 * Insert
	 */
	public void insert(int value)
	{
		array[nElements]=value;
		nElements++;
	}
	
	public void insertionSort()
	{
		int out,in,key;
		for(out=1;out<nElements;out++)
		{
				key=array[out];
				in=out;
				while(in>0 && array[in-1]>=key)
				{
					System.out.println("in = "+in+" out = "+out);
					array[in]=array[in-1];
					display();
					in--;
					
					
				}	
				array[in]=key;
				display();
		}
		
	}
	
	public void display()
	{
		for(int i=0;i<nElements;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}

}
