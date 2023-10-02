import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de minutos: ");
        int minutosTotales = scanner.nextInt();

        int horas = minutosTotales / 60; 
        int minutos = minutosTotales % 60;
        int segundos = 0; 

        System.out.println(minutosTotales + " minutos son " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
        scanner.close();
    }
}
