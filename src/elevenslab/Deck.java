package elevenslab;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author liuc5363
 */
public class Deck {
    public static final int NUMCARDS = 52;
    public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
    private ArrayList<Card> cards;
    private int top;

   //make a Deck constructor
    //refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck
    public Deck(){
        cards = new ArrayList<Card>();
        this.top = 51;
        for(String m: SUITS){
            for(int i = 1; i < 14; i++){
                cards.add(new BlackJackCard(m,i));
            }
        }
        
    }
   	

   
   //make a dealCard() method that returns the top card
   public String dealCard(){
        int x = top;
        top--;
        return cards.get(x).toString();
   }
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
   public void shuffle(){
       Collections.shuffle(cards);
       top = 51;
   }
}
