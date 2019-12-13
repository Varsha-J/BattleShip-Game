package main.java;

import java.util.Random;
import java.util.Scanner;

public class Play {



    public static int user(char[][] sea){

        Scanner input = new Scanner(System.in);

        int x = -1;
        int y = -1;
        char valid = 'n';
        while(valid !='y') {
            System.out.print("Enter X coordinate: ");
            x = input.nextInt();
            System.out.print("Enter Y coordinate: ");
            y = input.nextInt();
            if(x>9 || y>9){
                System.out.println("Invalid position! Guess again.");
            }
            else{
                valid = 'y';
            }
        }
        if(sea[x][y] == '2'){
            System.out.println("Boom! You sunk the ship!");
            sea[x][y] = '!';
            return 2;
        }
        else if(sea[x][y] == '1'){
            System.out.println("Oh no, you sunk your own ship :(");
            sea[x][y] = 'x';
            return 1;
        }
        else{
            System.out.println("Sorry, you missed");
            sea[x][y] = '-';
            return 0;
        }

    }

    public static int comp(char[][] sea){

        Random rand = new Random();
        int x = -1;
        int y = -1;
        char valid = 'n';
        while(valid !='y') {
            x = rand.nextInt(10);
            y = rand.nextInt(10);
            if (x < 10 && y < 10) {
                valid = 'y';
            }
        }
        if(sea[x][y] == '2'){
            System.out.println("The Computer sunk one of its own ships");
            sea[x][y] = '!';
            return 2;
        }
        else if(sea[x][y] == '1'){
            System.out.println("The Computer sunk one of your ships!");
            sea[x][y] = 'x';
            return 1;
        }
        else{
            System.out.println("Computer missed");
            return 0;
        }

    }
}
