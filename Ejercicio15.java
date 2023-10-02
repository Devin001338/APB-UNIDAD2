import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo (mayor que 1): ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingrese el divisor (mayor que 1): ");
        int divisor = scanner.nextInt();

        if (dividendo <= 1 || divisor <= 1) {
            System.out.println("Por favor, ingrese números enteros mayores que 1.");
        } else {
            int cociente = 0;
            int residuo = dividendo;

            while (residuo >= divisor) {
                residuo -= divisor;
                cociente++;
            }

            System.out.println("Cociente: " + cociente);
            System.out.println("Residuo: " + residuo);
        }

        scanner.close();
    }
}

