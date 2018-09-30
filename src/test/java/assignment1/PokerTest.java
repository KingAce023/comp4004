package assignment1;

import junit.framework.TestCase;
public class PokerTest extends TestCase{
	
	Poker hand = new Poker;
	Poker hand2 = new Poker;
	
	public void testHand(){
		
	    assertEquals(true, hand.equals(hand));
		
	}
	
	
	public void testDealCards(Poker hand){
	    assertEquals(true, hand.add());
	    assertEquals(true, hand2.add());

	}
	
	public void hasHighCard(Poker hand){
		
	}
    public void hasPair(Poker hand){
		
	}

    public void hasTwoPair(Poker hand){
    	
    }

    public void hasThreeOfAKind(Poker hand){
    	
    }

    public void hasStraight(Poker hand){
    	
    }

    public void hasFlush(Poker hand){
    	
    }

    public void hasFullHouse(Poker hand){
    	
    }

    public void hasFourOfAKind(Poker hand){
    	
    }

    public void hasStraightFlush(Poker hand){
    	
    }
    
    public void hasRoyalFlush(Poker hand){
    	
    }
	
}
