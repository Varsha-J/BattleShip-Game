package main.java;

import java.util.Arrays;

import static main.java.Deploy.compDeploy;
import static main.java.Deploy.userDeploy;
import static main.java.Print.printShip;

class main {
    public static void main(String args[]) {

        char[][] sea = new char[10][10];
        for (char[] row: sea)
            Arrays.fill(row,' ');
       System.out.println("* * * * Welcome to Battle Ships game * * * *");
       System.out.println("\n Right now, the sea is empty.");
       printShip(sea);
       userDeploy(sea);
       printShip(sea);
       compDeploy(sea);

       int u = 5;
       int c = 5;
       int temp;
       while(u>0 && c>0){
           temp = 0;
           System.out.println("\nYOUR TURN");
           temp = Play.user(sea);
           if(temp == 1){
               u -= 1;
           }
           else if(temp == 2){
               c -= 1;
           }
           temp = 0;
           System.out.println("\nCOMPUTER'S TURN");
           temp = Play.comp(sea);
           if(temp == 1){
               u -= 1;
           }
           else if(temp == 2){
               c -= 1;
           }
           printShip(sea);
           System.out.println("\nYour ships: " + u + " | Computer ships: " + c);
       }
       if(c == 0){
           System.out.println("\n Hooray! You win the battle :)");
       }
       else if(u == 0){
           System.out.println("\n Oops! Compiter Won.");
       }

    }


}


