import java.util.Scanner;

/**
 * Ejercicio3
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] ventas = new double[5];
 
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el valor de la venta: " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
        }
 
        int ventasMayoresA1M = 0;
        double sumaVentas = 0;
        double mayorVenta = ventas[0];
        double menorVenta = ventas[0];
 
        for (int i = 0; i < 5; i++) {
            sumaVentas += ventas[i];

            if (ventas[i] > 1000000) {
                ventasMayoresA1M++;
            }

            if (ventas[i] > mayorVenta) {
                mayorVenta = ventas[i];
            }

            if (ventas[i] < menorVenta) {
                menorVenta = ventas[i];
            }
        }
 
        double promedioVentas = sumaVentas / 5;
 
        System.out.println("Ventas mayores a 1,000,000: " + ventasMayoresA1M);
        System.out.println("Promedio de ventas: " + promedioVentas);
        System.out.println("Mayor venta: " + mayorVenta);
        System.out.println("Menor venta: " + menorVenta);
        scanner.close();
    }
}