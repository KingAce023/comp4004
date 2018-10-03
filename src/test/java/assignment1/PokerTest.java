package assignment1;

import junit.framework.TestCase;

public class PokerTest extends TestCase{
	
	Poker deck = new Poker();
	Hand aiHand = new Hand();
	Hand pHand = new Hand();
	
	public void testDealCards(){
		deck.fileReader();
		deck.readCardsFromFile();
		
	    assertEquals(true, pHand.add(deck.drawCard()));
	    assertEquals(true, pHand.add(deck.drawCard()));
	    assertEquals(true, pHand.add(deck.drawCard()));
	    assertEquals(true, pHand.add(deck.drawCard()));
	    assertEquals(true, pHand.add(deck.drawCard()));
	    
	    assertEquals(true, aiHand.add(deck.drawCard()));
	    assertEquals(true, aiHand.add(deck.drawCard()));
	    assertEquals(true, aiHand.add(deck.drawCard()));
	    assertEquals(true, aiHand.add(deck.drawCard()));
	    assertEquals(true, aiHand.add(deck.drawCard()));
	    pHand.showHand();
	    aiHand.showHand();
	}
	 /*public void testHasFlush(){
		    hand.fileReader();
		    hand.readCardsFromFile();
		 	hand.drawCard();
		 	
	    	assertEquals(true, hand.checkFlush());
	    	//assertEquals(false,hand.hand2.checkFlush());
	    	
	    	/*hand.fileReader("test2.txt");
	    	hand.addCard();
	    	assertEquals(false,hand.checkFlush());
	    	
	    	
	    	//hand.fileReader("test3.txt");
	    	//assertEquals(false,hand.checkFlush());
	    	
	    	//assertEquals(false,hand.checkFlush());
	    	
	    	//assertEquals(true, hand.getAICards().flush());*/
	   // }
	 

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
