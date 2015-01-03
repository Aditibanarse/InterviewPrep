package sorting;

public class SelectionSortApp {
	public static void main(String[] args) {
		SelectionSort sort=new SelectionSort(50);
		sort.insert(55);
		sort.insert(99);
		sort.insert(44);
		sort.insert(22);
		sort.insert(66);
		sort.insert(88);
		sort.insert(77);
		sort.insert(11);
		sort.insert(33);
		sort.insert(0);
		
		sort.display();
		sort.selectionSort();
		sort.display();
	}

}
