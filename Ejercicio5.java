import java.util.Random;

/**
 * Ejercicio5
 */
public class Ejercicio5 {

    public static void main(String[] args) {
         
        Random random = new Random();

         
        int dado1 = random.nextInt(6) + 1;  
        int dado2 = random.nextInt(6) + 1;
 
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
 
        if (dado1 == 6 && dado2 == 4) {
            System.out.println("¡Eres afortunado!");
        } else {
            System.out.println("No cumples con la condición. ¡Inténtalo de nuevo!");
        }
    }
}