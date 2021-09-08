/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author pupil
 */
import java.util.Random;
import java.util.Scanner;

public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(9-0+1)+0;
        System.out.println("Find a right number!");
        int userNumber = scanner.nextInt();
        if(number == userNumber) {System.out.println("You won!");}
        else {System.out.println("no, the number is: "+number);}
        }
    }
    
}
