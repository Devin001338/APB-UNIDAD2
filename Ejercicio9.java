import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        double totalFactura = 0.0;

        while (true) {
            System.out.print("Introduzca la cantidad vendida (0 para finalizar): ");
            int cantidad = scanner.nextInt();

            if (cantidad == 0) {
                break; // Salir del bucle si se ingresa 0
            }

            System.out.print("Introduzca el precio: ");
            double precio = scanner.nextDouble();

            if (cantidad > 0 && precio > 0) {
                totalFactura += cantidad * precio;
            } else {
                System.out.println("Por favor, ingrese cantidades y precios válidos.");
            }
        }

        System.out.println("Total de la factura: $" + totalFactura);
        scanner.close();
    }
}
