import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;
     Game(){
        Random random = new Random();
        this.number = random.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }
    boolean isCorrectNumber(){
         noOfGuesses++;
       
        if (inputNumber == number){
            System.out.printf("Yes you guesssed ot right, it was %d\nYou guessed it in %d attempts"
                    ,number, noOfGuesses);
            return true;

        } 
        else if(noOfGuesses >= 5){
        System.out.println("Guess limit reached....");
        return false;
         }
        else if (inputNumber < number){
            System.out.println("Too low"); return false;}
        else if (inputNumber > number){
            System.out.println("Too high"); return false;}
        return false;
    }
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}
public class PlayGame {
    public static void main(String[] args) {
        Game game = new Game();
        boolean b = false;
        while (!b){
            game.takeUserInput();
            b = game.isCorrectNumber();
            if(b) break;
            System.out.println(b);
        }


    }
}