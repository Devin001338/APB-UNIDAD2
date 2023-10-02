import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor por hora: ");
        double valorPorHora = scanner.nextDouble();

        double salarioBruto = calcularSalarioBruto(horasTrabajadas, valorPorHora);
        double retencion = calcularRetencion(horasTrabajadas);
        double salarioNeto = salarioBruto - retencion;

        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Retención: $" + retencion);
        System.out.println("Salario Neto: $" + salarioNeto);

        scanner.close();
    }

    public static double calcularSalarioBruto(int horasTrabajadas, double valorPorHora) {
        double salarioBruto;

        if (horasTrabajadas <= 40) {
            salarioBruto = horasTrabajadas * valorPorHora;
        } else {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - 40;
            double valorHoraExtra = valorPorHora + 2000; // Añadir $2000 por hora extra
            salarioBruto = (horasNormales * valorPorHora) + (horasExtras * valorHoraExtra);
        }

        return salarioBruto;
    }

    public static double calcularRetencion(int horasTrabajadas) {
        double retencion;

        if (horasTrabajadas <= 40) {
            retencion = calcularSalarioBruto(horasTrabajadas, 1) * 0.03; // 3% de retención
        } else {
            retencion = calcularSalarioBruto(horasTrabajadas, 1) * 0.045; // 4.5% de retención
        }

        return retencion;
    }
}

