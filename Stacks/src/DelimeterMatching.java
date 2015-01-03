
public class DelimeterMatching {
	
	String input;
	
	public DelimeterMatching(String in)
	{
		input=in;
	}
	
	/*
	 * check if the delimeters match
	 */
	public void check()
	{
		int length=input.length();
		DelimeterStack stack=new DelimeterStack(length);
		System.out.println("length = "+length);
		//check for the braces. Ignore the letters
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			switch(ch)
			{
			case '{':
			case '[':
			case '(':
			stack.push(ch);
			System.out.println("Pushed to stack");
			break;
			case '}':
			case ']':
			case ')':
				if(!stack.isEmpty())
				{
					char chx=stack.pop();
					System.out.println(chx);
					if(ch=='{' && chx!='}' || ch=='[' && chx!=']' || ch=='(' && ch!=')')
					System.out.println("Error at "+i);
				}
				else
					System.out.println("Stack empty");
				break;
				default:
					break;
			}
			
			}
		System.out.println("Control is here");
		if(!stack.isEmpty())
			System.out.println("no delimeters found");
		}
	}
	


