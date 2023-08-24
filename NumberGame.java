import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Game g = new Game();
        System.out.println("WELCOME TO GUESSING GAME AND YOU HAVE 5 ATTEMPTS ");
        int attempt = 5;
        Scanner s = new Scanner(System.in);

        while (attempt != 0) {
            System.out.println("GUESS  THE NUMBER  : ");

            int input_number = s.nextInt();
            int gnum = g.guessNumber(input_number);// take guessedNumber in gnum
            g.isCorrect(gnum, input_number);
            attempt--;
        }
        if (attempt == 0)
            System.out.println("YOU ATTEMPTS ARE OVER ");
        s.close();
    }
}

// make a class game
class Game {

    private int number;
    private int input_number;

    // generating getters and setters of both instance variables
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getInput_number() {
        return input_number;
    }

    public void setInput_number(int input_number) {
        this.input_number = input_number;
    }

    // make a method which generate a random number
    public int guessNumber(int input_number) {

        Random r = new Random();
        number = r.nextInt(100);
        return number;

    }
    // make a method to check whether the number is correct or not

    public void isCorrect(int number, int input_number) {
        if (number == input_number)
            System.out.println("YOU GUESSED THE NUMBER CORRECTLY ");
        else if (input_number < number)
            System.out.println("TOO LOW !");
        else if (input_number > number)
            System.out.println("TOO HIGH !");

    }
}
