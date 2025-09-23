public class Spelare {
    private String firstname;
    private String lastname;
    private int score;

    public Spelare(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.score = 0;

    }

    public void addToScore(int scoreToAdd) {
        this.score += scoreToAdd;
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }

    public int getScore() {
        return score;
    }
}
