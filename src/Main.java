package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CardGame cardgame = new CardGame("snapGame");
        System.out.println(cardgame.getName());
        ArrayList<Card> deckOfCards = cardgame.getDeckOfCards();
        System.out.println(deckOfCards);
        System.out.println("The first card is " + cardgame.dealCard(deckOfCards));
        System.out.println("Shuffled deck is " + cardgame.shuffleDeck(deckOfCards));
        System.out.println("Shuffle again" + cardgame.shuffleDeck(deckOfCards));
        System.out.println(deckOfCards);

        //System.out.println("sort deck into numbers " + cardgame.sortDeckInNumberOrder(deckOfCards));
        //System.out.println("sort deck in suits " + cardgame.sortDeckInSuits(deckOfCards));
    }
}
