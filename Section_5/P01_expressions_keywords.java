// to find no of expressions and knowledge about reserved keywords

public class P01_expressions_keywords {
    
    public static void main(String[] args) {
       

        int highScore = 50;

        if (highScore > 25){
            highScore = 1000 +highScore;   //add bonus points
        }
        System.out.println("Your highscore is " + highScore);

        int health = 100;

        if ((health < 25) &&  (highScore > 1000)) {
            highScore = highScore - 1000;
        }
        System.out.println("Your current highscore is " + highScore);
    }
}

// total 6 expressions 😊