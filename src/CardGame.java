package src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.shuffle;
import static src.CardUtils.symbols;
import static src.CardUtils.values;

public class CardGame {

        private final String NAME;
        public CardGame(String name){
            this.NAME = name;
        }

         private final ArrayList<Card> CARDS = new ArrayList<>();

    public String getName() {
        return NAME;
    }

    public ArrayList<Card> getDeckOfCards(){
             for (int i = 1; i < 14; i++) {
                 CARDS.add(new Card("♥",values[i], symbols.get(i-1)));
             }
             for (int i = 1; i < 14; i++) {
                 CARDS.add(new Card("♦",values[i], symbols.get(i-1)));
             }
             for (int i = 1; i < 14; i++) {
                 CARDS.add(new Card("♠",values[i], symbols.get(i-1)));
             }
             for (int i = 1; i < 14; i++) {
                 CARDS.add(new Card("♣",values[i], symbols.get(i-1)));
             }
        return CARDS;
    }



    public  Card dealCard(ArrayList<Card> cards) {
        return cards.getFirst();
    }

    public List<Card> shuffleDeck(ArrayList<Card> cards) {
//        List<Card> shuffledCards = new ArrayList<>(cards);
//        shuffle(shuffledCards);
//        return shuffledCards;
        shuffle(cards);
        return cards;
    }


    public ArrayList<Card> sortDeckInNumberOrder(ArrayList<Card> cards) {
        cards.sort(Card.CardValueNumber);
        return  cards;
    }

    public ArrayList<Card> sortDeckInSuits(ArrayList<Card> cards) {
        cards.sort(Comparator.comparing(Card::getSuit));
        return cards;
    }

}


