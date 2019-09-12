public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int playerScore1, int playerScore2) {
        String Score = "";
        boolean deuce = playerScore1 == playerScore2;
        if (deuce) {
            Score = testDrawGame(playerScore1);
        } else if (playerScore1 >= 4 || playerScore2 >= 4) {
            Score = checkOutTheAdvantagesAndResults(playerScore1, playerScore2);
        } else {
            Score = playerScores(playerScore1, playerScore2, Score);
        }
        return Score;
    }

    private static String playerScores(int playerScore1, int playerScore2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = playerScore1;
            } else {
                score += "-";
                tempScore = playerScore2;
            }

            score = checkTheScore(score, tempScore);
        }
        return score;
    }

    private static String checkTheScore(String score, int tempScore) {
        switch (tempScore) {
            case 0:
                score += "Love";
                break;
            case 1:
                score += "Fifteen";
                break;
            case 2:
                score += "Thirty";
                break;
            case 3:
                score += "Forty";
                break;
        }
        return score;
    }

    private static String checkOutTheAdvantagesAndResults(int playerScore1, int playerScore2) {
        String Score;
        int minusResult = playerScore1 - playerScore2;
        if (minusResult == 1) {
            Score = "Advantage player1";
        } else if (minusResult == -1) {
            Score = "Advantage player2";
        }else if (minusResult >= 2) {
            Score = "Win for player1";
        } else {
            Score = "Win for player2";
        }
        return Score;
    }

    private static String testDrawGame(int diem_nguoi_choi_1) {
        String ghiBan;
        switch (diem_nguoi_choi_1) {
            case 0:
                ghiBan = "Love-All";
                break;
            case 1:
                ghiBan = "Fifteen-All";
                break;
            case 2:
                ghiBan = "Thirty-All";
                break;
            case 3:
                ghiBan = "Forty-All";
                break;
            default:
                ghiBan = "Deuce";
                break;

        }
        return ghiBan;
    }

}
