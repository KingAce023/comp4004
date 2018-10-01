package assignment1;

import junit.framework.TestCase;

public class PokerTest extends TestCase{
	
	Poker hand = new Poker();
	
	public void testDealCards(){
	    assertEquals(true, hand.addCard());
	    assertEquals(true, hand.addCard2());

	}
	
	/*public void testHasHighCard(){
		assertEquals(true, hand.highCard(hand.getCards()));
		assertEquals(true, hand.highCard(hand.getAICards()));
	}
	
    public void testHasPair(){
		assertEquals(true, hand.pair(hand.getCards()));
		assertEquals(true, hand.pair(hand.getAICards()));
	}

    public void testHasTwoPair(){
    	assertEquals(true, hand.twoPairs());
    	assertEquals(true, hand.twoPairs());
    }

    public void testHasThreeOfAKind(){
    	assertEquals(true, hand.threeOfKind());
    	assertEquals(true, hand.threeOfKind());
    }

    public void testHasStraight(){
    	assertEquals(true, hand.straight());
    	assertEquals(true, hand.straight());
    }

    public void testHasFlush(){
    	assertEquals(true, hand.flush());
    	assertEquals(true, hand.flush());
    }

    public void testHasFullHouse(){
    	
    }

    public void testHasFourOfAKind(){
    	
    }

    public void testHasStraightFlush(){
    	
    }
    
    public void testHasRoyalFlush(){
    	
    }
	*/
}
