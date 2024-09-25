package src;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;
import static src.CardUtils.symbols;
import static src.CardUtils.values;

public class CardGame {

        private String name;
        public CardGame(String name){
            this.name = name;
        }

         private ArrayList<Card> deckOfCards = new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<Card> getDeckOfCards(){
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
        return deckOfCards;
    }



    public  Card dealCard(ArrayList<Card> cards) {
        return cards.getFirst();
    }

    public List<Card> shuffleDeck(ArrayList<Card> cards) {
        List<Card> shuffledCards = new ArrayList<>(cards);
        shuffle(shuffledCards);
        return shuffledCards;
    }

    public ArrayList<Card> sortDeckInNumberOrder(ArrayList<Card> cards) {
        cards.sort(Card.CardValueNumber);
        return  cards;
    };


//    private static String getDeckOfCards(ArrayList<Card> cards) {
//        return "The deck of cards includes "+cards;
//    }

    //dealCard(deckOfCards);

    //shuffleDeck(deckOfCards);

    //sortDeckInNumberOrder(deckOfCards);







}


