public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 y 100:");

        for (int numero = 2; numero <= 100; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        if (numero <= 3) {
            return true;
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
