package src;


import static src.CardUtils.values;

public class CardGame {
    public static void main(String[] args) {

        //my array list and add heart card spade card to it
        Card heartCard = new Card("♥",CardUtils.nextValue(),"thing");
        //System.out.println(heartCard);

//        Card spadeCard = new Card("♠",7,"thing");
//        System.out.println(spadeCard);
//
//        Card diamondCard = new Card("♦",7,"thing");
//        System.out.println(diamondCard);
//
//        Card clubCard = new Card("♣",7,"thing");
//        System.out.println(clubCard);

        for (int i = 1; i < 14; i++) {
            System.out.println(new Card("♥",CardUtils.nextValue(), values.get(i-1)));
        }






    }

}


