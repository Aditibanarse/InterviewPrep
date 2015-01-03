
public class GetChar {
	
	String input;
	String output;
	
	public GetChar(String input)
	{
		this.input=input;
		output="";
	}


	public String doReverse()
	{
		int length=input.length();
		System.out.println("Length of String "+length);

		ReverseWord rev=new ReverseWord(length);

		for(int i=0;i<input.length();i++)
		{
			char s=input.charAt(i);
			rev.push(s);
			
		}
		
		for(int i=0;i<input.length();i++)
		{
			char ch=rev.pop();
			output=output+ch;
		}
		
		return output;
	}
}
