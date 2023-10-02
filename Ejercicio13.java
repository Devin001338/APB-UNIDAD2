public class Ejercicio13 {
    public static void main(String[] args) {
        int capacidadJarra = 1000;
        int contenidoActual = 0;
        int tiempo = 0;

        while (contenidoActual < capacidadJarra) {
            tiempo++;

            // Llenar la jarra con 7 cc cada segundo
            contenidoActual += 7;

            // Verificar si han pasado 5 segundos para la pérdida del 5%
            if (tiempo % 5 == 0) {
                int perdida = (int) (contenidoActual * 0.05);
                contenidoActual -= perdida;
            }
        }

        System.out.println("La jarra se llena por completo en " + tiempo + " segundos.");

    }
}
