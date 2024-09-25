package src;

import java.util.Comparator;

//Card class
public class Card {
    private final String SUIT;
    private final int VALUE;
    private final String SYMBOL;

    //constructor
    public Card(String suit, int value, String symbol) {
        this.SUIT = suit;
        this.VALUE = value;
        this.SYMBOL = symbol;
    }

    public String getSuit() {
        return SUIT;
    }

    public int getValue() {
        return VALUE;
    }

    public String getSymbol() {
        return SYMBOL;
    }

    public static Comparator<Card> CardValueNumber = new Comparator<>() {
        @Override
        public int compare(Card o1, Card o2) {
            int cardNumberOne = o1.getValue();
            int cardNumberTwo = o2.getValue();
            return cardNumberOne-cardNumberTwo;
        }
    };

    @Override
    public String toString() {
        return "[The card suit is a " + this.SUIT + " has the symbol " + this.SYMBOL + " and has a value of " + this.VALUE + "]" +"\n";
    }























}