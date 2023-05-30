package erik.sarukhanyan.Spring_Introduction;

import java.util.Random;
import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        int balance;
        int bet;
        int reel1;
        int reel2;
        int reel3;
        int win;
        Scanner ask = new Scanner(System.in);
        System.out.println("Test your luck !");
        System.out.println("How much money you have ?");
        balance = ask.nextInt();
        System.out.println("How much money you want to bet ?");
        bet = ask.nextInt();


        Random rand = new Random();
        reel1 = rand.nextInt(2 + 1);
        reel2 = rand.nextInt(2 + 1);
        reel3 = rand.nextInt(2 + 1);
        System.out.println(reel1 + " " + reel2 + " " + reel3);

        if (reel1 == reel2 && reel1 == reel3){
            win = bet * 3;
            System.out.println("You won ");
            System.out.println("Your total win is " + " " + win);
            System.out.println("Your total balance is " + " " + (balance + win));
        }
        else {
            System.out.println("You lost :( ");
            System.out.println("Your total balance is " + " " + (balance - bet));
        }


    }
}
