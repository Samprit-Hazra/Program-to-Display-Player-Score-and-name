public class Method_Challenge2 {

    public static void main(String[] args){

        System.out.println("Welcome to our program!!");

        int position = CalculateHighScorePosition(500);
        displayPlayerInfo("Samprit",position);

        int position2 = CalculateHighScorePosition(1000);
        displayPlayerInfo("Bob",position2);

        int position3 = CalculateHighScorePosition(1000);
        displayPlayerInfo("Ali",position3);

    }

    public static int CalculateHighScorePosition(int score){

        if (score >= 1000){
            return 1;
        }
        else if ((score>=500)&&(score<1000)) {
            return 2;
        }
        else if ((score>=100)&&(score<500)) {
            return 3;
        }
        else{
            return 4;
        }

    }

    public  static void displayPlayerInfo(String name, int position)
    {
        System.out.println("Player named: " + name + " got " + position + " Position");
    }

}
