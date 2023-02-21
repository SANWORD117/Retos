import java.util.Scanner;

public class Retos2 {
    public static void main(String[] args) {

        String nombre_medico = "Jonh";
        String nombre_madre = "Doe";
        String nombre_bebe = "a";
        int ano_nacimiento = 0;
        int ano_actual = 2023;
        int conversion = 0;
        int meses_bebe = 0;
        double peso_bebe = 0.0;
        double dosis_vacunas = (double) 0.0;

        Scanner dosis = new Scanner(System.in);
        System.out.println("Ingresa el nombre del Medico: ");
        nombre_medico = dosis.next();

        System.out.println("Ingresa el nombre de la madre del Bebe: ");
        nombre_madre = dosis.next();

        System.out.println("Ingresa el nombre del Bebe: ");
        nombre_bebe = dosis.next();

        System.out.println("Ingresa el año de nacimiento del bebe: ");
     
        ano_nacimiento = dosis.nextInt();

        conversion = ano_nacimiento - ano_actual;
        meses_bebe = conversion / 36;

        System.out.println("Ingresa el peso del bebe: ");
        peso_bebe = dosis.nextDouble();

        dosis_vacunas = ((peso_bebe + 15) / (meses_bebe * 10)) * 8;

        System.out.println("RESULTADOS");
        System.out.println("Nombre del Medico: Dr. " + nombre_medico);
        System.out.println("Nombre de la Madre: " + nombre_madre);
        System.out.println("Nombre del Bebe: " + nombre_bebe);
        System.out.println("La dosis necesaria para el bebe es de: " + dosis_vacunas);

        dosis.close();
    }
}

