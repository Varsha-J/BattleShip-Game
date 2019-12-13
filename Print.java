package main.java;

public class Print {

    public static void printShip(char[][] sea){

        System.out.println("\n   0123456789   ");
        for(int i=0; i < sea.length; i++){

            System.out.print(i + " |");
            for(int j=0; j<sea[i].length; j++){

                if(sea[i][j] == '1'){
                    System.out.print('@');
                }
                else if(sea[i][j] == '2') {
                    continue;
                }
                else{
                    System.out.print(sea[i][j]);
                }

            }
            System.out.print("| " + i + "\n");
        }
        System.out.println("   0123456789   ");
    }

}
