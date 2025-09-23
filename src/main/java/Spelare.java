//Här lagrar vi data för våra användare
public class Spelare {
    private String firstname;
    private String lastname;
    private int score;

    //Konstruktor
    public Spelare(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.score = 0;

    }

    //Här lägger vi till poäng i användarens totala poäng
    public void addToScore(int scoreToAdd) {
        this.score += scoreToAdd;
    }

    //denna metod returnerar hela användarens namn åt oss
    public String getFullName() {
        return firstname + " " + lastname;
    }

    //denna metod returnerar spelarens hela poäng
    public int getScore() {
        return score;
    }
}
