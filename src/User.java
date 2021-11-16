public class User {
    String username;
    Double score;

    public User(String nickname, Double startAmt) {
        username = nickname;
        score = startAmt;
    }

    public void gamblePoints (double gambleAmt) throws Exception {
        if (gambleAmt > score) {
            throw new Exception("Unavailable Points to Gamble");
        } else {
            score = (score-gambleAmt);
        }
    }
    public void updateScore (double newScore) {
        score = newScore;
    }
}
