import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de N (número de términos): ");
        int N = scanner.nextInt();

        int sumatoria = calcularSumatoriaSerie(N);

        System.out.println("La sumatoria de los " + N + " términos de la serie es: " + sumatoria);

        scanner.close();
    }

    public static int calcularSumatoriaSerie(int N) {
        int sumatoria = 0;

        for (int i = 1; i <= N; i++) {
            int termino = 11 * i;
            sumatoria += termino;
        }

        return sumatoria;
    }
}
