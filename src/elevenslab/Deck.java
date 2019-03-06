package elevenslab;

import java.util.ArrayList;
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
        top = 51;
        for(int i = 0; i < SUITS.length; i++){
            for(int j = 1; j <= 13; j++){
                Card a = new Card(SUITS[i], j);
                System.out.println(a);
            }
        }
    }
   	

   
   //make a dealCard() method that returns the top card
   public static Card dealCard(){
        Card a = new Card();
        return a;
   }
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
}
