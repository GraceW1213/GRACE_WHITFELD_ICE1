/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Grace Whitfield
 */
public class CardTrick {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
           int value = (int)(Math.floor(Math.random()*13)+1);
            c.setValue(value);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int rnd = (int)Math.round(Math.random()*3);         
            c.setSuit(Card.SUITS[rnd]);
                               
        }// end of for loop
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please enter a number between 1-13: ");
        int number = input.nextInt();
        System.out.println("Please enter a suit for your card: ");
        String suit = input.nextLine();
        // and search magicHand here
        boolean match = false;
        for(int i=0; i<magicHand.length;i++){
           
            if(number == magicHand[i].getValue()){
                if (suit == magicHand[i].getSuit()){
                        match = true;
                }
            }      
        }
        
        //Then report the result here
        if (match == false)
            System.out.println("The card you picked is not part of the hand");
        if (match == true)
            System.out.println("The card you picked is in the magic hand!");
    }//end of main method
    
}
