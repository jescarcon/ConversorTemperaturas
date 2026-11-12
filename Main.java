import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorTemperaturas conversor = new ConversorTemperaturas();

        System.out.println("=== CONVERSOR DE TEMPERATURAS (Celsius a Fahrenheit) ===");
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        
        // Leemos el valor ingresado por el usuario
        double celsius = scanner.nextDouble();

        // Realizamos la conversión usando el método de la clase
        double fahrenheit = conversor.celsiusAFahrenheit(celsius);

        // Mostramos el resultado por consola
        System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F");

        // Cerramos el scanner para evitar fugas de recursos
        scanner.close();
    }
}