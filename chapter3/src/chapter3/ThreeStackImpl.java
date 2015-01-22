package chapter3;
/*
 * Implementation of three stacks using a single array
 * Assuming that the arrays are of equal size
 */
public class ThreeStackImpl {
	int array[];
	int size;
	int top_stack[]={0,0,0};

	public ThreeStackImpl(int size) {
		
		// TODO Auto-generated constructor stub
	this.size=size;
	array=new int[size*3];
	}
	
	
	/*
	 * insert element into stack using stack number
	 */
	void push(int stackNum, int value)
	{
		int index=size*stackNum+top_stack[stackNum];
		//check if individual stack is full

		top_stack[stackNum]++;
		array[index]=value;
	}
	
	public int pop(int stackNum)
	{
		int index=size*stackNum+top_stack[stackNum]-1;
		//check if individual stack is empty
		
		int val=array[index];
		array[index]=0;
		top_stack[stackNum]--;

		return val;
	}
	
	public int peek(int stackNum)
	{
		int index=size*stackNum+top_stack[stackNum]-1;
		//check if individual stack is empty

		return array[index];
		
	}
	
	public void display()
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(i+"  ");
		}
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"  ");
		}
		System.out.println();
	}

}
