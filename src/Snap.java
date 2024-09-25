package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snap extends CardGame {



    public ArrayList<Card> filterRemovedCardFromDeck(ArrayList<Card> cards, Card card) {
        cards.remove(card);
        return cards;
    }

    public String checkSnap(Card card1, Card card2) {
        if (card1 == card2) {
            return "Snap";
        }
        return "NoSnap";
    }

    public void playSnap() {


        CardGame snap = new CardGame();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter");

        ArrayList<Card> cards = snap.getDeckOfCards();
        ArrayList<Card> seperateCards = new ArrayList<>();
        snap.shuffleDeck(cards);
        Card card = snap.dealCard(cards);
        cards.remove(card);
        String readString = scanner.nextLine();

        while(readString!=null) {
            System.out.println(readString);
            snap.shuffleDeck(cards);
            card = snap.dealCard(cards);

            System.out.println(card);
            cards.remove(card);
            seperateCards.add(card);

            if(seperateCards.size()>2 && card.getValue() == seperateCards.get(seperateCards.size()-2).getValue()){
                System.out.println("theres a match you've wom");
                break;
            } else{
                System.out.println("no match yet");
            }


            if (readString.isEmpty()) {
                System.out.println("Press enter");

            }

            if (scanner.hasNextLine())
            {
                readString = scanner.nextLine();
            } else {
                readString = null;
            }
        }
    }


}
