package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame {

    public void playSnap() {
        CardGame snap = new CardGame();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter");
        ArrayList<Card> cards = snap.getDeckOfCards();
        ArrayList<Card> separateCards = new ArrayList<>();
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
            separateCards.add(card);

            if(separateCards.size()>2 && card.getValue() == separateCards.get(separateCards.size()-2).getValue()){
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
            }
            else {
                readString = null;
            }
        }
    }


}
