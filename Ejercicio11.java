import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción (1-3): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Hasta luego!");
                    break;
                case 2:
                    System.out.print("Ingrese un número para calcular el sumatorio: ");
                    int numeroSumatorio = scanner.nextInt();
                    int sumatorio = calcularSumatorio(numeroSumatorio);
                    System.out.println("El sumatorio de " + numeroSumatorio + " es: " + sumatorio);
                    break;
                case 3:
                    System.out.print("Ingrese un número para calcular el factorial: ");
                    int numeroFactorial = scanner.nextInt();
                    long factorial = calcularFactorial(numeroFactorial);
                    System.out.println("El factorial de " + numeroFactorial + " es: " + factorial);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida (1-3).");
                    break;
            }
        } while (opcion != 1);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1) Salir");
        System.out.println("2) Sumatorio");
        System.out.println("3) Factorial");
    }

    public static int calcularSumatorio(int numero) {
        int sumatorio = 0;
        for (int i = 1; i <= numero; i++) {
            sumatorio += i;
        }
        return sumatorio;
    }

    public static long calcularFactorial(int numero) {
        if (numero == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
