/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevenslab;

/**
 *
 * @author liuc5363
 */
public class Card
{
public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
		"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

    //instance variables
	//String suit
    public String suit = ""; 
	//int face
    public int face = 0;

    //constructors
    public Card(String suit, int face){
        this.suit = suit;
        this.face = face;
    }
  
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }
    public String toString(){
        return FACES[face] + " of " +  suit;
    }
 }
