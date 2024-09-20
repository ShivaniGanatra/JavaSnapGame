package src;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class CardUtils {

    //have static method that uses increment to increment card symbols

    static ArrayList<String> symbols = new ArrayList<>();

    static {
        symbols.add("2");
        symbols.add("3");
        symbols.add("4");
        symbols.add("5");
        symbols.add("6");
        symbols.add("7");
        symbols.add("8");
        symbols.add("9");
        symbols.add("10");
        symbols.add("J");
        symbols.add("Q");
        symbols.add("K");
        symbols.add("A");
    }


static int [] values ={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    

    public static void main(String[] args) {
        System.out.println(symbols);
    }
}

