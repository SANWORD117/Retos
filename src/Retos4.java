import java.util.Scanner; 
import java.util.Random;

public class Retos4 {
    public static void main(String[] args) {

        int a = 0,probabilidad, n = 0, decision = 1;
        int apuesta, gana, pierde;
        

        Scanner juego = new Scanner(System.in);

        do {
        System.out.print("Realiza tu apuesta (MIN $1000): ");
        apuesta = juego.nextInt();

        System.out.println("Apuesta " + (n+1));
        System.out.println("Ingrese 1 para elegir Piedra, 2 para elegir Papel o 3 para elegir Tijera");
        probabilidad = juego.nextInt();

        Random probabilidades = new Random();
        a = probabilidades.nextInt(3);
        a+=1;
        if (probabilidad==a) {

            System.out.println("Empate");

        } 
        
        else if (probabilidad==1 & a==2) {

            System.out.println("Has perdido");
            pierde = apuesta - apuesta;
            System.out.println("Ganaste: " + pierde);
        }

        else if (probabilidad==1 & a==3) {

            System.out.println("Has ganado");
            gana = apuesta + apuesta;
            System.out.println("Ganaste: " + gana);
        }

        else if (probabilidad==2 & a==1) {

            System.out.println("Has ganado");
            gana = apuesta + apuesta;
            System.out.println("Ganaste: " + gana);
        }

        else if (probabilidad==2 & a==3) {

            System.out.println("Has perdido");
            pierde = apuesta - apuesta;
            System.out.println("Ganaste: " + pierde);
        }

        else if (probabilidad==3 & a==1) {

            System.out.println("Has perdido");
            pierde = apuesta - apuesta;
            System.out.println("Ganaste: " + pierde);
        }

        else{

            System.out.println("Has ganado");
            gana = apuesta + apuesta;
            System.out.println("Ganaste: " + gana);
        }
        System.out.println("La maquina elijio " + a);
        System.out.println("Deseas jugar nuevamente?");
        System.out.println("1. SI / 2. NO");
        decision = juego.nextInt();
        n++;
        } while (decision == 1);
        
        System.out.println("Gracias por usar mi Software ( $ _ $ )");
        juego.close();
        }
    }
