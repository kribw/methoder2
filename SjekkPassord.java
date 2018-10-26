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
                    System.out.println("Passordet ditt er ugyldig.");
                }
            } else {
                System.out.println("Passordet ditt er ugyldig.");
            }
        } else {
            System.out.println("Passordet ditt er ugyldig.");
        }
    }

    public static boolean sjekkLengde(String sjekk) {
        if (sjekk.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean bokstavOgSiffer(String sjekk) {
        int antall = 0;
        for (int plass = 0; plass <= sjekk.length() - 1; plass++) {
            if (!Character.isLetterOrDigit(sjekk.charAt(plass))) {
                antall++;
            }
        }
        if (antall == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean minstToTall(String passord) {
        int antall = 0;
        for (int plass = 0; plass <= passord.length() - 1; plass++) {
            if (Character.isDigit(passord.charAt(plass))) {
                antall++;
            }
        }
        if (antall >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
