import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static boolean Round(int rNum){
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int attempts=5;
        int randNum=rand.nextInt(100)+1;
        boolean guess=false;
        System.out.println("Round "+rNum+" Guess number between 1 to 100");
        while(attempts>0 && !guess){
            System.out.println();
            System.out.println("Enter your guess");
            int input=sc.nextInt();
            if (attempts == 3) {
                if (randNum % 2 == 0) {
                    System.out.println("Hint: The number is even.");
                } else {
                    System.out.println("Hint: The number is odd.");
                }
            }
            if(input < randNum){
                System.out.println("Your guess is Low");
            }
            else if(input > randNum){
                System.out.println("Your guess is high");
            }
            else{
                System.out.println("Correct! You guessed number");
                guess=true;
            }
            attempts--;
        }
        if(!guess){
            System.out.println("Sorry you ran out of attempts. The correct number was "+randNum);
        }
        return guess;
    }
    public static void playGame(){
        Scanner sc=new Scanner(System.in);
        int rounds=3;
        int score=0;
        for(int r=1;r<=rounds;r++){
           boolean won= Round(rounds);
           if(won){
            score++;
           }
            System.out.println("Do u want to play again ? (y/n)");
            String playAgain=sc.next();
            if (playAgain.equalsIgnoreCase("n")) {
                System.out.println("You chose to end the game.");
                break;
            } else {
                System.out.println("Starting a new round...");
            }
        }
        System.out.println("Game over! Your score is: "+score+"/"+rounds);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game! ");
        playGame();
    }
}
