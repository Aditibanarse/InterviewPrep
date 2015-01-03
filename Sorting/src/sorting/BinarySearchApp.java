package sorting;

public class BinarySearchApp {

	public static void main(String args[])
	{
		BinarySearch arr=new BinarySearch(100);
		arr.insert(99);
		arr.insert(66);
		arr.insert(33);
		arr.insert(88);
		arr.insert(55);
		arr.insert(44);
		arr.insert(22);
		arr.insert(77);
		arr.insert(11);
		arr.insert(0);
		
		arr.display();
		int pos=arr.search(55);
		System.out.println("Found element at position "+pos);
		arr.delete(55);
		arr.display();
		arr.delete(22);
		arr.display();
		
	}
}
