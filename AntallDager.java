public class AntallDager {
    public static void main(String[] args) {
        for (int year = 2000; year <= 2020; year++) {
            System.out.println("År " + year + " har " + numberOfDaysInAYear(year) + " dager.");
        }
    }

    public static int numberOfDaysInAYear(int currentYear) {
        int dager;
        if (currentYear % 400 == 0 || (currentYear % 4 == 0 && currentYear % 100 != 0)) {
            dager = 366;
            return dager;
        } else {
            dager = 365;
            return dager;
        }
    }
}
