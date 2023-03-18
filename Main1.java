import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){

        System.out.println("Welcome to our program!");

        playerInfo();
        playerScore(500);
    }

    public static void playerInfo()
    {
        System.out.println("Enter the player's name: \t");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Enter the player's position: \t");
        Scanner scb = new Scanner(System.in);
        int position = scb.nextInt();

        System.out.println("Player named: " + name + " got " + position + " Position");

    }

    public static void playerScore(int score)
    {
        if (score >= 1000){
            System.out.println("The player got the score 1");
        }

        else if ((score>=500)&&(score<1000)) {
            System.out.println("The player got score 2");
        }

        else if ((score>=100)&&(score<500)) {
            System.out.println("The player got score 3");
        }

        else{
            System.out.println("The player got score 4");
        }

    }
}
