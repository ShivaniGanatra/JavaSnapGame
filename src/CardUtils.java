package src;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class CardUtils {

    //have static method that uses increment to increment card values
    private static int value = 0;
    static ArrayList<String> values = new ArrayList<>();

    public static int nextValue() {return ++value;}
    static {
        values.add("2");
        values.add("3");
        values.add("4");
        values.add("5");
        values.add("6");
        values.add("7");
        values.add("8");
        values.add("9");
        values.add("10");
        values.add("J");
        values.add("Q");
        values.add("K");
        values.add("A");
    }

    public static void main(String[] args) {
        System.out.println(values);
    }
}

