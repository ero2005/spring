package erik.sarukhanyan.Spring_Introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Casino {
    private static int balance = 1000;
    private static int bet = 200;
    private static int[] symbols = {1, 2};

    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("Your balance is " + balance);
        System.out.println("Your bet is 200");
        System.out.println("Type S to play or Q to exit !");
        while (balance > 0) {
            String input = ask.next();

            if (input.equalsIgnoreCase("Q")){
                System.out.println("Thanks for playing, your total balance is " + " " + balance);
                break;
            }
            else if(input.equalsIgnoreCase("S")){
                play();
            }
        }
        System.out.println("Have a great year !");
        ask.close();
    }
    private static void play(){
        balance -= bet;
        System.out.println("Spinning the reels ...");
        Random random = new Random();
        int[] result = new int[3];
        for (int i = 0; i < 3; i++) {
            result[i] = symbols[random.nextInt(symbols.length)];
            System.out.print(result[i] + " ");
        }
        if (result[0] == result[1] && result[0] == result[2]){
            int win = bet * 3;
            balance += win;
            System.out.println("\nCongratulations you won" + " " + win + " " + "drams");
            System.out.println("\nYour total balance is " + (balance));
        }else {
//            balance -= bet;
            System.out.println("\nYou lost :( \nPlease try again");
            System.out.println("\nYour total balance is " + balance);
        }
    }
}
