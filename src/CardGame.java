package src;


import java.util.ArrayList;

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

        System.out.println(deckOfCards);
        System.out.println(deckOfCards.size());
    }

}


