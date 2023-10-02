import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número de 3 dígitos: ");
        int numero = sc.nextInt();

        if (numero < 100 || numero > 999) {
            System.out.println("El número que ingreso no tiene 3 dígitos.");
        } else {
            int digito1 = numero / 100;         
            int digito2 = (numero / 10) % 10;
            int digito3 = numero % 10;
            
            int medio = 0;
            if ((digito1 >= digito2 && digito1 <= digito3) || (digito1 <= digito2 && digito1 >= digito3)) {
                medio = digito1;
            } else if ((digito2 >= digito1 && digito2 <= digito3) || (digito2 <= digito1 && digito2 >= digito3)) {
                medio = digito2;
            } else {
                medio = digito3;
            }
            
            System.out.println("El número del medio es: " + medio);
        }
        
        sc.close();
    }
}
