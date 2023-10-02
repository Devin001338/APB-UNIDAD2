import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numeroSecreto = generarNumeroSecreto(random);

        System.out.println("Bienvenido al juego de Picas y Fijas!");
        System.out.println("Intenta adivinar el número secreto de 4 dígitos.");
        System.out.println("Las pistas son:");
        System.out.println("Picas: Dígitos correctos en posición incorrecta.");
        System.out.println("Fijas: Dígitos correctos en posición correcta.");

        int intentos = 0;

        while (true) {
            System.out.print("Ingresa tu intento (4 dígitos no repetidos): ");
            String intentoStr = scanner.nextLine();

            if (intentoStr.length() != 4) {
                System.out.println("Debes ingresar exactamente 4 dígitos.");
                continue;
            }

            int[] intento = new int[4];

            try {
                for (int i = 0; i < 4; i++) {
                    intento[i] = Integer.parseInt(intentoStr.substring(i, i + 1));
                }
            } catch (NumberFormatException e) {
                System.out.println("Debes ingresar dígitos válidos.");
                continue;
            }

            if (!sonDigitosUnicos(intento)) {
                System.out.println("Debes ingresar dígitos no repetidos.");
                continue;
            }

            int picas = contarPicas(numeroSecreto, intento);
            int fijas = contarFijas(numeroSecreto, intento);

            intentos++;

            System.out.println("Picas: " + picas);
            System.out.println("Fijas: " + fijas);

            if (fijas == 4) {
                System.out.println("¡Felicidades! Has adivinado el número secreto en " + intentos + " intentos.");
                break;
            }
        }

        scanner.close();
    }

    public static int[] generarNumeroSecreto(Random random) {
        int[] numeroSecreto = new int[4];
        for (int i = 0; i < 4; i++) {
            numeroSecreto[i] = random.nextInt(10);
        }
        return numeroSecreto;
    }

    public static boolean sonDigitosUnicos(int[] numero) {
        for (int i = 0; i < numero.length; i++) {
            for (int j = i + 1; j < numero.length; j++) {
                if (numero[i] == numero[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int contarPicas(int[] secreto, int[] intento) {
        int picas = 0;
        for (int i = 0; i < secreto.length; i++) {
            for (int j = 0; j < intento.length; j++) {
                if (secreto[i] == intento[j] && i != j) {
                    picas++;
                }
            }
        }
        return picas;
    }

    public static int contarFijas(int[] secreto, int[] intento) {
        int fijas = 0;
        for (int i = 0; i < secreto.length; i++) {
            if (secreto[i] == intento[i]) {
                fijas++;
            }
        }
        return fijas;
    }
}
