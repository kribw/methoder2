public class Konvertering {
    public static double fahrenheitStart = 120;
    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
        System.out.println("--------------------------------------------------");

        for(double celsiusStart = 40; celsiusStart > 30; celsiusStart--) {
            double konvertertFahrenheit = celsiusToFahrenheit(celsiusStart);
            double konvertertCelsius = fahrenheitToCelsius(fahrenheitStart);
            System.out.printf("%.2f\t\t%.2f\t\t|\t%.2f\t\t%.2f\n", celsiusStart, konvertertFahrenheit, fahrenheitStart, konvertertCelsius);
            fahrenheitStart -= 10;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheitConv = (9.0 / 5) * celsius + 32;
        return fahrenheitConv;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsiusConv = (5.0 / 9) * (fahrenheit - 32);
        return celsiusConv;
    }
}
