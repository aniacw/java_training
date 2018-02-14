package NumberGuessGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NumberGuess numberGuess = new NumberGuess();
        int mysteriousNumber = numberGuess.createRandomNumber();
        boolean hasWon = false;//????????
        System.out.println("I have randomly selected a number between 1 and 100");
        System.out.println("Try and guess it");
        Scanner scanner = new Scanner(System.in);
        for(int i = 10; i>0; i--){
            System.out.println("You have " + i + " guesses left. Try again");
            int guess = scanner.nextInt();
            if(mysteriousNumber>guess){
                System.out.println("Try higher number");
            }
            else if(mysteriousNumber<guess){
                System.out.println("Try lower number");
            }
            else if(mysteriousNumber==guess){
                hasWon = true;
                break;
            }
        }
        if(hasWon){
            System.out.println("You won!");
        }
        else {
            System.out.println("Game over - you lost!");
        }
        System.out.println("End");


    }
}
