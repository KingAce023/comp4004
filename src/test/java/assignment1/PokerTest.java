package assignment1;

import junit.framework.TestCase;
public class PokerTest extends TestCase{
	
	Poker hand = new Poker;
	Poker hand2 = new Poker;
	
	public void testHand(){
		
	    assertEquals(true, hand.equals(hand));
		
	}
	
	
	public void testDealCards(Poker hand, Poker hand2){
	    assertEquals(true, hand.add());
	    assertEquals(true, hand2.add());

	}
	
	public void hasHighCard(Poker hand, Poker hand2){
		assertEquals(true, hand.highCard());
		assertEquals(true, hand2.highCard());
	}
	
    public void hasPair(Poker hand, Poker hand2){
		assertEquals(true, hand.pair());
		assertEquals(true, hand2.pair());
	}

    public void hasTwoPair(Poker hand, Poker hand2){
    	
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
