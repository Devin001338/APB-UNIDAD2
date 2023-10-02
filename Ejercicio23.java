import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        String binario = convertirABinario(numeroEntero);

        System.out.println("El número " + numeroEntero + " en binario es: " + binario);

        scanner.close();
    }

    public static String convertirABinario(int numero) {
        if (numero == 0) {
            return "0"; // El número 0 es su propia representación binaria
        }

        StringBuilder binario = new StringBuilder();

        while (numero > 0) {
            int residuo = numero % 2;
            binario.insert(0, residuo); // Insertar el residuo al principio de la cadena
            numero /= 2;
        }

        return binario.toString();
    }
}
