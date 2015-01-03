import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DelimeterApp {
	
	public static void main(String[] args) throws IOException 
	{
		String input;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		System.out.println("Enter a String with Delimeters");
		input=br.readLine();
		DelimeterMatching dm=new DelimeterMatching(input);
		dm.check();
		
	}

}
