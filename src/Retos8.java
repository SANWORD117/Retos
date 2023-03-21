import java.util.Scanner;

public class Retos8 {

    public static void main(String[] args) {

        String nombre, correo, telefono;
        int edad, estrato, eleccion = 0;

        Scanner bono = new Scanner(System.in);

        System.out.println("Bienvenido al registro para el bono. Por favor ingrese su información:");

        System.out.print("Nombre completo: ");
        nombre = bono.nextLine();

        System.out.print("Correo electrónico: ");
        correo = bono.nextLine();

        System.out.print("Número de teléfono: ");
        telefono = bono.nextLine();

        System.out.print("Edad: ");
        edad = bono.nextInt();

        System.out.print("Estrato: ");
        estrato = bono.nextInt();

        if (edad <= 17 && estrato <= 3) {

            eleccion = 1;

        }

        System.out.println("Gracias por registrarse. Aquí están sus detalles:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo electrónico: " + correo);
        System.out.println("Número de teléfono: " + telefono);
        System.out.println("Edad: " + edad);
        System.out.println("Estrato: " + estrato);

        if (eleccion == 1) {
            System.out.println("¡Felicidades, eres elegible para el bono!");
        } else {
            System.out.println("Lo sentimos, no eres elegible para el bono.");
        }

        bono.close();
    }
}
