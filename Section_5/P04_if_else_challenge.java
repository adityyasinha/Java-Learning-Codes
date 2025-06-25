public class P04_if_else_challenge {

     public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        
        if(gameOver == true) {
            finalScore += (levelCompleted*bonus);
            finalScore +=1000;           
            System.out.println("Your final score was " + finalScore);
        
        }
    //      boolean newGameOver = true;
    //     int newScore = 10000;
    //     int newLevelCompleted = 8;
    //     int newBonus = 200;

    //     int newFinalScore = newScore;

    //     if(newGameOver) {
    //        newFinalScore += (newLevelCompleted*newBonus);
    //         System.out.println("Your final score was " + newFinalScore);
   
    // }
     }
}