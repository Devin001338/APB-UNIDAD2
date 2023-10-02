import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese un número positivo: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Imprimiendo " + numero + " asteriscos:");
            
            for (int i = 0; i < numero; i++) {
                System.out.print("*");
            }

            System.out.println(); 
        } else {
            System.out.println("Lo siento, el número ingresado no es válido. Por favor, ingrese un número positivo.");
        }
        scanner.close();
    }
}
