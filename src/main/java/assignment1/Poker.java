package assignment1;
import java.io.*; 
import java.util.*;
public class Poker 
{	
	String[] cards = new String[50];
	String[] hand = new String[5];
	String[] hand2 = new String[5];
	private Scanner sc;
	
	public void fileReader(){
		//file reads for cards then converts scanner to string and splits 
		//the whitespace in the string
		try{
			File fileName = new File("/Users/Soltan/Desktop/test.txt");   
			sc = new Scanner(fileName);
		    String line = sc.nextLine();
		    cards = line.split(" ");
		} 
		 catch(FileNotFoundException ex){
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
	
	public boolean addCard(){
		fileReader();
		int i;
		for( i = 0; i<5; i++){
			hand[i]=cards[i];
		}
		if(i==5){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean addCard2(){	
			hand2[0]=cards[5];
			hand2[1]=cards[6];
			hand2[2]=cards[7];
			hand2[3]=cards[8];
			hand2[4]=cards[9];
			
		if(hand2[4] != null){
			return true;
		}
		else{
			return false;
		}
	}
	
	//public boolean flush(String[] cards){
	//	char suit = cards[0].charAt(0);
	//}
	
	
}
