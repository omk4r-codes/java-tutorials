package OOPS;
import java.util.Random;
import java.util.Scanner;
/*
    Create a class Game, which allows a user to play "Guess the Number" game once. Game should have the following methods:
    1. Constructor to generate the random number
    2. takeUserInput () to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4. getter and setter for noofUesses
    Use properties such as noOfGuesses(int), etc to get this task done!
*/
class Game{
    int random = new Random().nextInt(100);
    Scanner sc = new Scanner(System.in);
    int noOfChances = 1;
    int guess;
    Game(){
        System.out.println(random);
    }

    public int getnoOfChances() {
        return noOfChances;
    }

    public void setnoOfChances(int noOfChances) {
        this.noOfChances = noOfChances;
    }

    public void takeUserInput(){
        System.out.println("Enter the number: ");
        guess = sc.nextInt();
    }
    
    public int isCorrectNumber(int guess){
        if(guess == random){
            System.out.printf("You won in %d chances!", getnoOfChances());
            return 1;
        }
        else {
            if(guess < random) {
                System.out.println("Please try again with a greater number!");
            }
            else{
                System.out.println("Please try again with a smaller number!");
            }
            return 0;
        }
    }
}
public class Prog4_GuessNumber {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Guess the number: ");
        game.takeUserInput();
        while(game.isCorrectNumber(game.guess)!= 1){
            game.takeUserInput();
            game.setnoOfChances(game.getnoOfChances() + 1);
//            game.isCorrectNumber(game.guess);
        }
    }
}
