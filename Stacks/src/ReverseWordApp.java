import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseWordApp {
	
	public static void main(String[] args) throws IOException {
		
		String input;
		String output="";
		
		System.out.println("Enter a String ");
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		input=br.readLine();
		GetChar get=new GetChar(input);
		
		output=get.doReverse();
		System.out.println("Reverse of the input String "+output);
		
	}

}
