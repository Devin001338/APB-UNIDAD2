import java.util.Scanner;

public class Ejercicio7 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud de los tres lados del triángulo:");
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();

        if (esTrianguloValido(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triángulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triángulo Isósceles.");
            } else {
                System.out.println("Es un triángulo Escaleno.");
            }
        } else {
            System.out.println("Los lados ingresados no forman un triángulo válido.");
        }
        scanner.close();
    }

    // Verificar si los lados forman un triángulo válido
    public static boolean esTrianguloValido(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
 
}
