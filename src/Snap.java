package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snap extends CardGame {

    CardGame Snap = new CardGame();

    public ArrayList<Card> filterRemovedCardFromDeck(ArrayList<Card> cards, Card card) {
        cards.remove(card);
        return cards;
    };

}
