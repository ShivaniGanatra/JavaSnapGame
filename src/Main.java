package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        CardGame cardgame = new CardGame("snapGame");
//        System.out.println(cardgame.getName());
//        ArrayList<Card> deckOfCards = cardgame.getDeckOfCards();
//        System.out.println(deckOfCards);
//        System.out.println("The first card is " + cardgame.dealCard(deckOfCards));
//        System.out.println("Shuffled deck is " + cardgame.shuffleDeck(deckOfCards));
//        System.out.println("Shuffle again" + cardgame.shuffleDeck(deckOfCards));
//        System.out.println(""+cardgame.dealCard(deckOfCards));

        //System.out.println("sort deck into numbers " + cardgame.sortDeckInNumberOrder(deckOfCards));
        //System.out.println("sort deck in suits " + cardgame.sortDeckInSuits(deckOfCards));


        Snap snap = new Snap();
        ArrayList<Card> AllCards = snap.getDeckOfCards();

        Card card = snap.dealCard(AllCards);
        System.out.println("card to remove is "+ card);
        ArrayList<Card> filteredCards = snap.filterRemovedCardFromDeck(AllCards, card);
        System.out.println(filteredCards + " " + filteredCards.size());




        //snap.filterRemovedCardFromDeck(cards,);



//        Scanner s = new Scanner(System.in);
//        System.out.println("Press Enter");
//        s.nextLine();
//        System.out.println("Thank you");

    }
}
