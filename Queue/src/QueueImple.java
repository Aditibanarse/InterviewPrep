
public class QueueImple {

	public int queue[];
	private int front=0;
	private int rear=-1;
	int size;
	
	public QueueImple(int size)
	{
		this.size=size;
		queue=new int[size];
		
	}
	
	public void insert(int num)
	{
		System.out.println("Size= "+size);
		if(isFull())
		{
			System.out.println(rear-front);
			System.out.println("Queue full");
			
		}
		else
		{
			System.out.println("inserting at "+(rear+1));
				queue[++rear]=num;
				System.out.println("rear = "+rear);

			if(rear>=size-1)
				rear=-1;
		}
	}
	
	public int remove()
	{
		if(isEmpty())
			return -1;
		else
			return queue[front++];
	}
	
	public boolean isEmpty()
	{
		return(rear+1==front|| rear==front+size-1);
	}
	
	public boolean isFull()
	{
		return(rear+2==front || rear==front+size-2);
	}
}
