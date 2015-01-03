package sorting;

public class BubbleSort {
	private int array[];
	int nElements;
	
	BubbleSort(int size)
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
	
	/*
	 * Bubble Sort
	 */
	public void bubblesort()
	{
		for(int out=nElements-1; out>1;out--)
		{
			System.out.println("out is at "+out);

			for(int in=0;in<out;in++)
			{
				if(array[in]>array[in+1])
					swap(in,in+1);
			}
		}
	}
	
	/*
	 * display
	 */
	public void display()
	{
		for(int i=0;i<nElements;i++)
			System.out.print(array[i]+" | ");
		System.out.println();
	}
	/*
	 * Swap
	 */
	public void swap(int prev, int next)
	{
		int temp=array[next];
		array[next]=array[prev];
		array[prev]=temp;
		display();
	}

}
