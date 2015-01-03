
public class InsertionSort {
	
	public static void main(String args[])
	{
		int[] numbers={3,7,19,6,32,5};
		System.out.println("Before Sorting");
		printArray(numbers);
		insertionSort(numbers);
		System.out.println("Sorted Array");
		printArray(numbers);
		
	}

	private static void insertionSort(int[] numbers) {
		// TODO Auto-generated method stub
		
		for(int outer=1;outer<numbers.length;outer++)
		{
			int inner=outer-1;
			int key=numbers[outer];
			System.out.println("Comparing "+key+ " with " + numbers[inner]);
			while(key<numbers[inner] && inner>=0)
			{
				System.out.println("Comparing "+key+ " with " + numbers[inner]);
				numbers[inner+1]=numbers[inner];
				inner--;
			}
			numbers[inner+1]=key;
			printArray(numbers);

		}
		
	}

	private static void printArray(int[] numbers) {
		// TODO Auto-generated method stub
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i]+ " ");
		}
		System.out.println();
		
		
	}

}
