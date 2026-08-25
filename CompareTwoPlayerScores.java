/*Write the pseudocode that:
Puts each player's score into a named container.
Creates a Boolean container for whether Player 1 scored higher than Player 2 — by comparing the two containers.
Creates a Boolean container for whether Player 2 scored higher than Player 1 — by comparing the two containers.
Creates a Boolean container for whether the two scores are equal — by comparing the two containers.
Shows all three answers. */
class CompareTwoPlayerScores{
    public static void main(String[] args) {
        int player1Score = 85; // Container for Player 1's score
        int player2Score = 85; // Container for Player 2's score
        
        boolean isPlayer1Higher = player1Score > player2Score; // Boolean container for Player 1 scoring higher
        boolean isPlayer2Higher = player1Score < player2Score; // Boolean container for Player 2 scoring higher
        boolean areScoresEqual = player1Score == player2Score; // Boolean container for scores being equal
        
        System.out.println("Is Player 1's score higher? " + isPlayer1Higher);
        System.out.println("Is Player 2's score higher? " + isPlayer2Higher);
        System.out.println("Are the scores equal? " + areScoresEqual);
    }
}   
