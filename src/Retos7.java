import java.util.Scanner; 
import java.util.Random;

public class Retos7 {
    public static void main(String[] args) {

        int a = 0,probabilidad, decision = 1, vidas = 3;
        int gana = 0, pierde = 0, saldo, apuesta;
        

        Scanner juego = new Scanner(System.in);

        System.out.println("BIENVENIDO AL JUEGO DE PIEDRA; PAPEL Y TIJERA");
        System.out.print("Por favor, ingrea con el monto con el que deseas jugar : ");
        saldo = juego.nextInt();

        while (decision == 1) {
        for (int i = 0; i < vidas; i++) {

            System.out.println("Realiza tu apuesta (MIN $1000)");
            apuesta = juego.nextInt();
            if (apuesta > 1000){
                System.out.println("Apuesta hecha: $" + apuesta);
    
                } else {
                    System.out.println("Lo siento, debes apostar $1000 como minimo para poder jugar");
                }

            System.out.println("Apuesta " + (i+1));
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
                saldo = pierde;
                System.out.println("Dinero actual: " + saldo);

            }

            else if (probabilidad==1 & a==3) {

                System.out.println("Has ganado");
                gana = apuesta + apuesta;
                saldo = gana;
                System.out.println("Dinero actual: " + saldo);
            }

            else if (probabilidad==2 & a==1) {

                System.out.println("Has ganado");
                gana = apuesta + apuesta;
                saldo = gana;
                System.out.println("Dinero actual: " + saldo);
            }

            else if (probabilidad==2 & a==3) {

                System.out.println("Has perdido");
                pierde = apuesta - apuesta;
                saldo = pierde;
                System.out.println("Dinero actual: " + saldo);
            }

            else if (probabilidad==3 & a==1) {

                System.out.println("Has perdido");
                pierde = apuesta - apuesta;
                saldo = pierde;
                System.out.println("Dinero actual: " + saldo);
            }

            else {

            System.out.println("Has ganado");
                gana = apuesta + apuesta;
                saldo = gana;
                System.out.println("Dinero actual: " + saldo);
            }

            vidas-=1;

            System.out.println("Te quedan " + vidas + " vidas");
            System.out.println( "La maquina ha elegido " + a);

            if (saldo == 0) {
            System.out.println("Te quedaste sin dinero, no puedes jugar mas");
            decision = 2;
            } else  if (vidas == 0) {
            System.out.println("FIN DEL JUEGO :)");
            decision = 2;
            } else {
            System.out.println("Deseas jugar nuevamente?");
            System.out.println("1. SI / 2. NO");
            decision = juego.nextInt();
            }
        }
        }
            System.out.println("Gracias por usar mi Software ( $ _ $ )");
            juego.close();
    }
}
            