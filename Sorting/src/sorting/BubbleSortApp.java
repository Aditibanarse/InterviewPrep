package sorting;

public class BubbleSortApp {
	public static void main(String[] args) 
	{
		BubbleSort bsort=new BubbleSort(100);
		bsort.insert(99);
		bsort.insert(1);
		bsort.insert(0);
		bsort.insert(55);
		bsort.insert(65);
		bsort.insert(12);
		bsort.insert(8);
		bsort.insert(9);
		bsort.insert(49);
		bsort.insert(69);
		
		bsort.display();
		bsort.bubblesort();
		bsort.display();
		
	}

}
