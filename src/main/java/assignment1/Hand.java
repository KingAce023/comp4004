package assignment1;

import java.util.ArrayList;

public class Hand {
ArrayList<String> hand = new ArrayList<String>();

	public boolean add(String s){
		hand.add(s);
		return true;
	}
	
	public void remove(Poker p){
		
	}
	public void showHand(){
		for(int i=0; i<hand.size();i++){
			System.out.println(hand.get(i));
		}
	}
}
