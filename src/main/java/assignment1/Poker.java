package assignment1;
import java.io.*; 
import java.util.*;
public class Poker 
{

	public static void main(String args[])  throws FileNotFoundException
	{
		String[] cards = new String[50];
		//file reads for cards
		try{
			File fileName = new File("/Users/Soltan/Desktop/test.txt");   
			Scanner sc= new Scanner(fileName);
		    String line = sc.nextLine();
		    cards = line.split(" ");
		} 
		 catch(IOException ex){
		        System.out.println (ex.toString());
		        System.out.println("File not found");
		}
		
		for(int i = 0; i < cards.length; i++)
		{
			System.out.println("this is " +  i + " card " + cards[i]);
		}
	}
}

