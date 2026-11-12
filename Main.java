import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConversorTemperaturas conversor = new ConversorTemperaturas();

        System.out.println("=== CONVERSOR DE TEMPERATURAS ===");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                System.out.print("Ingrese la temperatura en Celsius: ");

                double celsius = scanner.nextDouble();

                double fahrenheit = conversor.celsiusAFahrenheit(celsius);

                System.out.println(celsius + " °C equivalen a "
                        + fahrenheit + " °F");
                break;

            case 2:
                System.out.print("Ingrese la temperatura en Fahrenheit: ");

                double fahrenheit2 = scanner.nextDouble();

                double celsius2 = conversor.fahrenheitACelsius(fahrenheit2);

                System.out.println(fahrenheit2 + " °F equivalen a "
                        + celsius2 + " °C");
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}