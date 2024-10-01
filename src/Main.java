package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    private String str = "";

    TimerTask task = new TimerTask()
    {
        public void run()
        {
            if(str.isEmpty())
            {
                System.out.println( "You've taken too long to answer correctly so the original winner remains" );
                System.exit( 0 );
            }
        }
    };

    public void getInput(String player, String playerName) throws Exception
    {
        Timer timer = new Timer();
        timer.schedule( task, 5*1000 );

        System.out.println( player + "aka" + playerName +" you can still type snap or SNAP in five seconds to win: " );
        BufferedReader in = new BufferedReader(
                new InputStreamReader( System.in ) );
        str = in.readLine();
        if(Objects.equals(str, "snap") || Objects.equals(str, "SNAP")){
            System.out.println(player + "aka" + playerName + " you were quick with it, you're now the winner");
        } else {
            System.out.println( "Unfortunately " + player + "aka" + playerName + " you haven't entered the correct string");
        }
        timer.cancel();

    }
    public static void main(String[] args) {
        /**/
        Snap snap = new Snap();

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object


        int number = 0;
        try {
            System.out.println("Hi if you wanna play one player enter 1 for two players enter 2");
            System.out.println();
            number = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("You haven't typed a number");
        }

        if (number == 1) {
            System.out.println("You've selected one player");
            snap.playOnePlayerSnap();


        } else if (number == 2) {

            System.out.println("You've selected two player");
            System.out.println("Hi please can you enter your name");
            System.out.println();
            String userName1 = scanner.nextLine();  // Read user input
            Player player1 = new Player(1, "default");
            player1.setName(userName1);
            System.out.println("Hi " + player1.getName() + " you are player" + player1.getNumber());

            System.out.println("Hi player 2 please can you enter your name");
            System.out.println();
            String userName2 = scanner.nextLine();
            Player player2 = new Player(2, "default");
            player2.setName(userName2);
            System.out.println("Hi " + player2.getName() + " you are player" + player2.getNumber());

            String result = snap.playTwoPlayersSnap();
            String oppositeSnapWinner;
            String playerName;
            if (Objects.equals(result, "Player Two won")) {
                oppositeSnapWinner = "Player One";
                 playerName = player1.getName();
            } else {
                oppositeSnapWinner = "Player Two";
                playerName = player2.getName();
            }
            try {
                (new Main()).getInput(oppositeSnapWinner, playerName);

            } catch (Exception e) {
                System.out.println(e);

            }
        }
        else {
            System.out.println("You need to enter 1 or 2");
        }
    }
}
