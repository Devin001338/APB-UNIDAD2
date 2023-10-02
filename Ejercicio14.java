import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(1000) + 1;
        int intentos = 0;
        int intentoJugador;

        System.out.println("Bienvenido al juego de adivinar el número entre 1 y 1000.");
        System.out.println("Intenta adivinar el número secreto.");

        do {
            System.out.print("Ingresa tu intento: ");
            intentoJugador = scanner.nextInt();
            intentos++;

            if (intentoJugador < numeroAleatorio) {
                System.out.println("El número secreto es mayor.");
            } else if (intentoJugador > numeroAleatorio) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");

                if (intentos >= 1 && intentos <= 3) {
                    System.out.println("De 1 a 3: Suertudo");
                } else if (intentos >= 4 && intentos <= 6) {
                    System.out.println("De 4 a 6: Genio");
                } else if (intentos >= 7 && intentos <= 8) {
                    System.out.println("De 7 a 8: Se puede mejorar");
                } else {
                    System.out.println("De 9 en adelante: No eres muy inteligente");
                }

                break;
            }
        } while (true);

        scanner.close();
    }
}
