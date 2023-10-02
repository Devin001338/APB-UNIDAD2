import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int cuadrado = calcularCuadrado(numero);

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

        scanner.close();
    }

    public static int calcularCuadrado(int numero) {
        int cuadrado = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                cuadrado += i;
            }
        }

        return cuadrado;
    }
}
