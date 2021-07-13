package ticTacToe;
import java.util.Scanner;

public class player {
    String name;    //  player's username
    char symbol;    //  player's symbol (X or O)
    int roundsWon;   //  player's amount of rounds won

    // define a static scanner
    static Scanner input = new Scanner(System.in);

    // generate a new player object
    public static player createPlayer(int playerNumber) {
        player newPlayer = new player();
        newPlayer.name = newPlayerUsername(playerNumber);
        newPlayer.symbol = (playerNumber == 1) ? 'X' : 'O';
        newPlayer.roundsWon = 0;
        System.out.println("PLAYER " + playerNumber + " is " + newPlayer.name + ", will play with " + newPlayer.symbol + "\n");
        return newPlayer;
    }

    // request player's username
    public static java.lang.String newPlayerUsername(int playerNumber) {
        System.out.print("Insert name of PLAYER " + playerNumber + ": ");
        String username = input.nextLine().toUpperCase();
        return username;
    }

    public Boolean checkValidUsername() {
        return !this.name.isBlank() && name.length() <= 25 && name.matches("^[a-zA-Z0-9 ]*$");
    }

}
