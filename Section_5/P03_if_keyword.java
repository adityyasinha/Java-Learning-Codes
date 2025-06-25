public class P03_if_keyword {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        }   else if (score < 1000) {
            System.out.println("YOUR SCORE WAS LESS THAN 1000");
        } else {
            System.out.println("You have a different score");
        }
    }    
}
