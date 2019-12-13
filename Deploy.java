package main.java;

import java.util.Random;
import java.util.Scanner;

public class Deploy {
    public static void userDeploy(char[][] sea){
        Scanner input = new Scanner(System.in); //This line creates a Scanner for you to use

        int i = 0;
        System.out.println("\nDeploy your ships: ");
        while(i<5){
            System.out.print("Enter X coordinate for your ship " + i + ": ");
            int x = input.nextInt();
            System.out.print("Enter Y coordinate for your ship " + i + ": ");
            int y = input.nextInt();

            if(x>9 || y>9){
                System.out.println("Illegal position! Re-enter:");
            }
            else if(sea[x][y] == '1'){
                System.out.println("Location already occupied. Re-enter:");
            }
            else{
                sea[x][y] = '1';
                i++;
            }
        }
    }

    public static void compDeploy(char[][] sea){
        Random rand = new Random();
        System.out.println("\nComputer is deploying ships: ");
        int i=0;
        while(i<5){
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);

            if(x>9 || y>9){
                continue;
            }
            else if(sea[x][y] == '1'){
                continue;
            }
            else{
                sea[x][y] = '2';
                System.out.println(i + ". Ship Deployed");
                i++;
            }
        }
        System.out.println("---------------------------------");


    }
}
