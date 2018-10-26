public class Konvertering {
    public static void main(String[] args) {
        double fahrenheitStart = 120;
        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
        System.out.println("--------------------------------------------------");
        for(double celsiusStart = 40; celsiusStart > 30; celsiusStart--) {
            System.out.printf("%.1f\t\t%.2f\t\t|\t%.1f\t\t%.2f\n", celsiusStart, celsiusToFahrenheit(celsiusStart), fahrenheitStart, fahrenheitToCelsius(fahrenheitStart));
            fahrenheitStart -= 10;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
