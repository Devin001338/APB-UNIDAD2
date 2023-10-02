import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese las horas trabajadas esta semana: ");
            int horasTrabajadas = scanner.nextInt();

            double salario = calcularSalario(horasTrabajadas);
            System.out.println("Salario semanal: $" + salario);

            System.out.print("¿Desea calcular el salario de otro empleado? (S/N): ");
            String respuesta = scanner.next();

            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        } while (true);

        scanner.close();
    }

    public static double calcularSalario(int horasTrabajadas) {
        double tarifaPorHora = 15000;
        double tarifaHoraExtra = 27000;
        int horasNormales = Math.min(horasTrabajadas, 35);
        int horasExtras = Math.max(horasTrabajadas - 35, 0);

        double salario = (horasNormales * tarifaPorHora) + (horasExtras * tarifaHoraExtra);
        return salario;
    }
}
