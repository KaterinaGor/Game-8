package game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int attempt = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(9-0+1)+0;
        System.out.println("Find a right number!");
        //for (int i = 0; i < 3; i++) {
        while (true){
            int userNumber = scanner.nextInt();
            if(number == userNumber) {System.out.println("You won!"); 
            break;
            } else {
                if(attempt < 2){
                System.out.println("Try again!");
                } else {
                System.out.println("You lose!");
                break;
                }
            }
            attempt++;
        }
    }
    
}
