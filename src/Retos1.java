import java.util.Scanner;

public class Retos1 {
    public static void main(String[] args) {
        int grados_c = 350;
        double grados_k = 0.0;
        double conversion = 0.0;

        Scanner horno = new Scanner(System.in);
        conversion = grados_c + 273.15;

        grados_k = conversion;

        System.out.println("La Temperatura a ºC es: " + grados_k);
        horno.close();

        Scanner harina = new Scanner (System.in);

        int personas = 10;
        int gramos = 13;
        int conversion_2 = 0;

        conversion_2 = gramos * personas;
        double kilogramos = (double) conversion_2 / 1000;

        System.out.println("La cantidad necesaria para usar en el pastel es de " + kilogramos + " kilogramos");
        harina.close();
    }
}
