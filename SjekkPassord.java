import java.util.Scanner;

public class SjekkPassord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv inn ditt hemmelige passord: ");
        String passord = input.next();
        if (sjekkLengde(passord)) {
            if (bokstavOgSiffer(passord)) {
                if (minstToTall(passord)) {
                    System.out.println("Passordet ditt er gyldig.");
                } else {
                    System.out.println("Passordet ditt er ikke gyldig. Det må inneholde minst to siffer.");
                }
            } else {
                System.out.println("Passordet ditt er ikke gyldig. Det kan kun inneholde bokstaver og siffer.");
            }
        } else {
            System.out.println("Passordet ditt er ikke gyldig. Det må minst være 8 tegn.");
        }
    }

    public static boolean sjekkLengde(String sjekk) {
        return sjekk.length() >= 8;
    }

    public static boolean bokstavOgSiffer(String sjekk) {
        int antall = 0;
        for (int plass = 0; plass <= sjekk.length() - 1; plass++) {
            if (!Character.isLetterOrDigit(sjekk.charAt(plass))) {
                antall++;
            }
        }
        return antall == 0;
    }

    public static boolean minstToTall(String passord) {
        int antall = 0;
        for (int plass = 0; plass <= passord.length() - 1; plass++) {
            if (Character.isDigit(passord.charAt(plass))) {
                antall++;
            }
        }
        return antall >= 2;
    }
}
