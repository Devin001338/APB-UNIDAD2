public class Ejercicio6 {
    public static void main(String[] args) {
        int numeroVendedores = 5;
        double salarioBaseSemanal = 250000;
        double porcentajeComision = 0.09;
 
        double comisionSemanal = salarioBaseSemanal * porcentajeComision;
 
        double salarioMensual = (salarioBaseSemanal + comisionSemanal) * 4;
 
        double costoTotalMensual = salarioMensual * numeroVendedores;

        System.out.println("El salario mensual para un vendedor es: $" + salarioMensual);
        System.out.println("El costo total mensual para la empresa Mypime es: $" + costoTotalMensual);
    }
}
