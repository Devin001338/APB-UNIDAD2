import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        Random random = new Random();
        int cantidadClientes = 10;

        for (int cliente = 1; cliente <= cantidadClientes; cliente++) {
            String[] colores = { "rojo", "amarillo", "blanco" };
            int indiceColor = random.nextInt(colores.length);
            String colorBolita = colores[indiceColor];

            double totalCompra = calcularTotalCompra();

            double descuento = calcularDescuento(colorBolita, totalCompra);
            double montoFinal = totalCompra - descuento;

            System.out.println("Cliente " + cliente + ":");
            System.out.println("Color de la bolita: " + colorBolita);
            System.out.println("Total de la compra: $" + totalCompra);
            System.out.println("Descuento aplicado: $" + descuento);
            System.out.println("Monto a pagar: $" + montoFinal);
            System.out.println();
        }
    }

    public static double calcularTotalCompra() {
        return Math.random() * 1000 + 1;
    }

    public static double calcularDescuento(String colorBolita, double totalCompra) {
        double descuento = 0;

        switch (colorBolita) {
            case "rojo":
                descuento = totalCompra * 0.4;
                break;
            case "amarillo":
                descuento = totalCompra * 0.25;
                break;
            case "blanco":
                descuento = 0;
                break;
        }

        return descuento;
    }
}
