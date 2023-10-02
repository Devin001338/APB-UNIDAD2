import java.util.Scanner;

class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la edad del deportista: ");
        int edad = sc.nextInt();

        sc.nextLine();

        System.out.println("Ingrese la nacionalidad del deportista: ");
        String nacionalidad = sc.next();
        
        System.out.println("Ingrese el peso del deportista: ");
        int peso = sc.nextInt();
        
        String mensajeCumplimiento = String.format("El deportista cumple con todos los requisitos especificados\n Edad: %d.\n Nacionalidad: %s.\n Peso: %d ", edad, nacionalidad, peso);


        if (edad > 15 && nacionalidad.equals("colombiano") && peso >= 60 && peso <= 90) {
            System.out.println(mensajeCumplimiento);
        } else {
            System.out.println("El deportista no es apto para practicar el deporte.");
            if (edad <= 15) {
                System.out.println("Requisito no cumplido: La edad no es mayor a 15 años.");
            }
            if (!nacionalidad.equals("colombiano")) {
                System.out.println("Requisito no cumplido: No es de nacionalidad colombiana.");
            }
            if (peso < 60 || peso > 90) {
                System.out.println("Requisito no cumplido: Peso entre 60 y 90 kilos.");
            }
        }
        sc.close();

    }
}
