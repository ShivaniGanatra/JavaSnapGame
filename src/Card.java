package src;

public class Card {
     String suit;
    int value;
    String symbol;

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

    public String toString() {
        return "[The card suit is a " + this.suit + " has the symbol " + this.symbol + " and has a value of " + this.value + "]" +"\n";
    }




















}