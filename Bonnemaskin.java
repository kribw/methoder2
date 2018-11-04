import java.util.Scanner;

public class Bonnemaskin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Oppgi antall baller: ");
        int baller = input.nextInt();

        System.out.print("Oppgi antall spor: ");
        int antallSpor = input.nextInt();
        int[] spor = new int[antallSpor];

        for(int print = 0; print <= baller; print++) {
            getPathForOneBall(baller);
        }
        printResult(spor);
    }

    // Genererer en tilfeldig sti for et ball, returnerer indeksen for søylen som ballet har havnet inni.
    private static int getPathForOneBall(int baller) {
        int path = 0;
        for (int jump = 0; jump <= baller - 1; jump++) {
            boolean left = (Math.random() < 0.5);
            if(left) {
                System.out.print("L");
                path--;
            } else {
                System.out.print("R");
                path++;
            }
        }
        System.out.println();
        return path;
    }

    // Skriver ut søyler med sine baller til skjerm.
    private static void printResult(int[] slots) {
        int printAmount = max(slots) + 1;
        for(int print = 0; print < printAmount; print++) {

        }
    }

    // Returnerer indeks for søylen med flest baller. Brukes i printResult metoden.
    private static int max(int[] slots) {
        int index = 0;
        for (int check = 0; check <= slots.length; check++) {
            if (slots[check] > index) {
                index = slots[check];
            }
        }
        return index;
    }
}
/*

*/
