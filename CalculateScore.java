public class CalculateScore {

    public static void main(String[] args) {

        int newScore = calculateScore("Morgan", 500);
        System.out.println("New Score is " + newScore);
        int newScore1 = calculateScore(300);
        System.out.println("Unnamed player " + newScore1);
        calculateScore();  // no arguments because there are not parameters in the method below

    }


    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
    // overloading a method examples
    // This occurs by changing the parameters within the method without changing the actual method name
    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore() {
        // this method has no parameters and will not need arguments
        System.out.println("No Player name no player points.");
        return 0;
    }




}
