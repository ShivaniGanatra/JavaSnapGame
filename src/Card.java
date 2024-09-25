package src;

import java.util.Comparator;

//Card class
public class Card {
    private String suit;
    private int value;
    private String symbol;

    //constructor
    public Card(String suit, int value, String symbol) {
        this.suit = suit;
        this.value = value;
        this.symbol = symbol;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public static Comparator<Card> CardValueNumber = new Comparator<Card>() {
        @Override
        public int compare(Card o1, Card o2) {
            int cardNumberOne = o1.getValue();
            int cardNumberTwo = o2.getValue();
            return cardNumberOne-cardNumberTwo;
        }
    };



    @Override
    public String toString() {
        return "[The card suit is a " + this.suit + " has the symbol " + this.symbol + " and has a value of " + this.value + "]" +"\n";
    }























}