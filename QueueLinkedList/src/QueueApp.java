
public class QueueApp {
	public static void main(String[] args) {
		Queue q=new Queue();
		System.out.println("Queue is Empty = "+q.isEmpty());
		q.insert(65);
		q.insert(45);
		q.insert(23);
		q.insert(43);
		q.insert(12);
		q.insert(78);
		System.out.println("pop = "+q.remove());
		System.out.println("pop = "+q.remove());
		System.out.println("pop = "+q.remove());

		

	}

}
