import java.util.Random;
import java.util.Scanner;


public class Inlamningsuppgift1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Information om spelare 1
        System.out.print("Spelare 1's förnamn: ");
        String s1förnamn = scanner.nextLine().trim(); //trim tar bort överflödiga mellanslag som användaren kan råka skriva ut.

        System.out.print("Spelare 1's efternamn: ");
        String s1efternamn = scanner.nextLine().trim();

        // Information om spelare 2
        System.out.print("Spelare 2's förnamn: ");
        String s2förnamn = scanner.nextLine().trim();

        System.out.print("Spelare 2's efternamn: ");
        String s2efternamn = scanner.nextLine().trim();

        //Här är våra två spelare
        Spelare player1 = new Spelare(s1förnamn, s1efternamn);
        Spelare player2 = new Spelare(s2förnamn, s2efternamn);

        //Vi ber användaren bestämma vad den vill göra
        System.out.println("Skriv 'spela' för att spela, eller 'stopp' för att avsluta.");
        String svar = scanner.nextLine().trim();

        //Om användaren skriver ut "spela" så skriver datorn ut att spelet startar.
        if (svar.equals("spela")) {
            System.out.println("Spelet startar");

            //spelare 1 slår sitt slag
            for (int i = 1; i <= 2; i++) { //Här skapar vi en variabel, ett villkor, och hur mycket som ska öka för varje varv
                int roll = random.nextInt(6) + 1; //här slår vi en tärning
                player1.addToScore(roll); //vi lägger till resultatet
                System.out.println(player1.getFullName() + "slog " + roll + " i kast nr " + i + ")");
            }

            System.out.println(); //bara en tom rad i det som visas för användaren

// Spelare 2 slår sitt slag
            for (int i = 1; i <= 2; i++) {
                int roll = random.nextInt(6) + 1;
                player2.addToScore(roll);
                System.out.println(player2.getFullName() + " slog " + roll + " i kast nr " + i + ")");
            }

            // vi skriver ut vad alla fick i resultat
            System.out.println("Era resultat");
            System.out.println(player1.getFullName() + " - totalpoäng: " + player1.getScore());
            System.out.println(player2.getFullName() + " - totalpoäng: " + player2.getScore());

            //vi ser vem som fick högst poäng och skriver ut vinnaren eller oavgjort
            if (player1.getScore() > player2.getScore()) {
                System.out.println(" Vinnaren är " + player1.getFullName());
            } else if (player1.getScore() < player2.getScore()) {
                System.out.println("Vinnaren är " + player2.getFullName());
            } else {
                System.out.println("Oavgjort");
            }
            //om någon har skrivit stopp
        } else if (svar.equals("stopp")) {
            System.out.println("Tack för idag.");
        } else {
            //om någon har skrivit något annat än de alternativ som fanns att välja på
            System.out.println("Ej acceptabelt svar. Programmet avslutas.");
        }
        scanner.close();

    }
}
