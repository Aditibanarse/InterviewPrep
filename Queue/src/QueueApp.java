
public class QueueApp {
	public static void main(String[] args) {
		
		QueueImple q=new QueueImple(6);
		
		System.out.println("Queue empty? "+q.isEmpty());
		q.insert(34);
		q.insert(44);
		q.insert(54);
		q.insert(64);
		q.insert(74);
		System.out.println(q.isFull());
		System.out.println(q.remove());
		System.out.println(q.remove());
		q.insert(88);
		q.insert(98);
		System.out.println(q.isEmpty()+ " " + q.remove());
		
		System.out.println(q.remove());
		System.out.println(q.remove());

	}

}
