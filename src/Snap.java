package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame {
    CardGame snap = new CardGame();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Card> cards = snap.getDeckOfCards();
    ArrayList<Card> separateCards = new ArrayList<>();
    ArrayList<Integer> oddOrEven = new ArrayList<>();

    public void playOnePlayerSnap() {
        System.out.println("Press Enter");
        snap.shuffleDeck(cards);
        Card card = snap.dealCard(cards);
        cards.remove(card);
        String readString = scanner.nextLine();

        while(readString!=null) {
            System.out.println(readString);
            card = snap.dealCard(cards);
            System.out.println(card);
            cards.remove(card);
            separateCards.add(card);
            int intToTrack = separateCards.size();
            oddOrEven.add(intToTrack);

            if(oddOrEven.size() > 1 && card.getValue() == separateCards.get(separateCards.size()-2).getValue()){
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

    public String playTwoPlayersSnap() {
        System.out.println("Hi Player One click enter to deal a card");
        snap.shuffleDeck(cards);
        Card card = snap.dealCard(cards);
        cards.remove(card);
        String readString = scanner.nextLine();


        while(readString!=null) {
            System.out.println(readString);
            card = snap.dealCard(cards);
            cards.remove(card);
            separateCards.add(card);
            int intToTrack = separateCards.size();
            oddOrEven.add(intToTrack);
            if(oddOrEven.getLast() % 2 == 0){
                System.out.println("Player Two's card is " + card);
            }
            if (oddOrEven.getLast() % 2 == 1){
                System.out.println("Player One's card is " + card);
            }

            if(oddOrEven.size() > 1 && card.getValue() == separateCards.get(separateCards.size()-2).getValue()){

                if(oddOrEven.getLast() %2 == 0){
                    System.out.println("player Two theres a match you've won but ...");
                } else {
                    System.out.println("Player One theres a match you've won but ...");
                }
                break;
            } else {
                System.out.println("No match yet");
            }

            if (readString.isEmpty()) {
                if(!(oddOrEven.getLast() % 2 == 0)){
                    System.out.println("Hi Player Two can you click to enter a card");
                } else System.out.println("Hi Player One can you click to enter a card");
            }

            if (scanner.hasNextLine())
            {
                readString = scanner.nextLine();
            }
            else {
                readString = null;
            }
        }
        if(oddOrEven.getLast() % 2 == 0){
            return "Player Two won";
        } return "Player One won";

    }
}
