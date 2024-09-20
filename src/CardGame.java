package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.shuffle;
import static src.CardUtils.symbols;
import static src.CardUtils.values;

public class CardGame {
    public static void main(String[] args) {


        ArrayList<Card> deckOfCards = new ArrayList<>();




        for (int i = 1; i < 14; i++) {
            deckOfCards.add(new Card("♥",values[i], symbols.get(i-1)));
        }
        for (int i = 1; i < 14; i++) {
            deckOfCards.add(new Card("♦",values[i], symbols.get(i-1)));
        }
        for (int i = 1; i < 14; i++) {
            deckOfCards.add(new Card("♠",values[i], symbols.get(i-1)));
        }
        for (int i = 1; i < 14; i++) {
            deckOfCards.add(new Card("♣",values[i], symbols.get(i-1)));
        }

        //dealCard(deckOfCards);

        //shuffleDeck(deckOfCards);

        //sortDeckInNumberOrder(deckOfCards);

        getDeckOfCards(deckOfCards);

    }



    private static void getDeckOfCards(ArrayList<Card> cards) {
        System.out.println("The deck of cards includes "+cards);
    }

    private static void dealCard(ArrayList<Card> cards) {
        System.out.println("The first card is " + "\n" + cards.getFirst());
    }

    private static void shuffleDeck(ArrayList<Card> cards) {
        List<Card> shuffledCards = new ArrayList<>(cards);
        shuffle(shuffledCards);
        System.out.println("The shuffled cards are" + "\n" + shuffledCards);
    }

    private static void sortDeckInNumberOrder(ArrayList<Card> cards) {

        cards.sort(Card.CardValueNumber);
        for(Card card:cards){
            System.out.println(card);
        }
    }










}


