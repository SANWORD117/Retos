import java.util.Scanner;
import java.util.Random;

public class Retos3 {
    public static void main(String[] args) {
        
        int a = 0, probabilidad, saldo, apuesta, ganancias, perdidas, n = 0, decision = 1;

        Scanner moneda = new Scanner(System.in);

        System.out.println("BIENVENIDO AL JUEGO DE CARA O SELLO");

        System.out.print("Ingresa el saldo en total con el que deseas jugar: ");
        saldo = moneda.nextInt();

        do {

            System.out.println("Ingrese la cantidad que desee apostar");
            System.out.println("Apuesta minima = $1000");
            apuesta = moneda.nextInt();

            Random probabilidades = new Random();
            a = probabilidades.nextInt(2);
            a+=1;

            if (apuesta > 1000){
            System.out.println("Apuesta hecha: " + apuesta);
            
            System.out.println("Apuesta " + (n+1));

            } else {
                System.out.println("Lo siento, debes apostar $1000 como minimo para poder jugar");
            }
            
            System.out.println("Ingrese 1 para elegir Cara o 2 para elegir Sello");
            probabilidad = moneda.nextInt();
            
            if (probabilidad==a) {
            System.out.println("Has ganado");
            ganancias = apuesta * 2;
            saldo = ganancias;
            
            System.out.println("Dinero actual: " + saldo);
            } 
    
            else {
            System.out.println("Has perdido");
            perdidas = apuesta - apuesta;
            saldo = perdidas;
            System.out.println("Dinero actual: " + saldo);
            }

            System.out.println( "La maquina ha elegido " + a);

            if (saldo == 0) {
            System.out.println("Te quedaste sin dinero, no puedes jugar mas");
            decision = 2;
            } else {
            System.out.println("Deseas jugar nuevamente?");
            System.out.println("1. SI / 2. NO");
            decision = moneda.nextInt();
            }
            n++;
        } while (decision== 1);

        System.out.print("Muchas gracias por jugar!");
        moneda.close();
    }
}