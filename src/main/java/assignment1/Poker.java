package assignment1;
import java.io.*; 
import java.util.*;
public class Poker 
{	
	String[] cards = new String[50];
	String[] hand = new String[10];
	String[] hand2 = new String[10];
	public void fileReader() throws FileNotFoundException{
		//file reads for cards then converts scanner to string and splits 
		//the whitespace in the string
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
		//Testing cards are printing right in sequence
		for(int i = 0; i < cards.length; i++)
		{
			System.out.println("this is " +  i + " card " + cards[i]);
		}
	}
	
	public String[] getCards(){
		return hand;
	}
	
	public String[] getAICards(){
		return hand2;
	}
	
	public boolean addCard(String[] cards){
		
		int i;
		for( i = 0; i<5; i++){
			hand[i]=cards[i];
		}
		if(i==5){
			Arrays.sort(hand);
			System.out.println(hand);
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean addCard2(String[] cards){
		int i;
		for( i = 4; i<10; i++){
			hand[i]=cards[i];
		}
		if(i ==10){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean flush(String[] cards){
		char suit = cards[0].charAt(0);
	}
	
	public static void main(String args[])  throws FileNotFoundException
	{
		
	}
}
