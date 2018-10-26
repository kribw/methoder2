public class AntallDager {
    public static int year = 2000;

    public static void main(String[] args) {
        for (int years = 2000; years < 2021; years++) {
            System.out.println("År " + years + " har " + numberOfDaysInAYear(years) + " dager.");
            year++;
        }
    }

    public static int numberOfDaysInAYear(int year) {
        int dager;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            dager = 366;
            return dager;
        } else {
            dager = 365;
            return dager;
        }
    }
}
