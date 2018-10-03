package assignment1;
import java.io.*; 
import java.util.*;
public class Poker 
{
	ArrayList<String> cards = new ArrayList<String>();
	private Scanner sc;
	
	public void fileReader(){
		//file reads for cards then converts scanner to string and splits 
		//the whitespace in the string
		try{
			File fileName = new File("/Users/Soltan/Desktop/test.txt");
			sc = new Scanner(fileName);
		} 
		 catch(FileNotFoundException ex){
		        System.out.println (ex.toString());
		        System.out.println("File not found");
		}
	}
	
	public void readCardsFromFile(){	
		while(sc.hasNextLine())
		{
			String[] line = sc.nextLine().split(" ");
			for (String s: line){
				cards.add(s);
			}
		}
	}
	
	public String drawCard(){
		String s=""; 
		s= cards.get(0);
		cards.remove(0);
		return s;
	}
	
	/*public boolean checkFlush(){
		char suit = hand[0].charAt(0);
		if(hand[1].charAt(0) == suit && hand[2].charAt(0) == suit && hand[3].charAt(0) == suit && hand[4].charAt(0) == suit)
		{
			return true;
		}
		else{
			return false;
		}
	}*/
	
	
}
