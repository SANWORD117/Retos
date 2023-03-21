import java.util.Scanner;

public class Retos5 {
    public static void main(String[] args) {

        int n = 0, decision = 1;
        int documento = 0;
        int cantidad;
        
        
        double total = 0;
        double valor;
        double subtotal;
        
        String cajero;
        String cliente = "";
        String producto;
        

        try (Scanner caja_reg = new Scanner(System.in)) {
            System.out.println("Caja #" + (n+1));
            System.out.print("Ingrese el nombre del cajero: ");
            cajero = caja_reg.next();

            do {
                for (int i = 0; i < 1; i++) {

                System.out.print("Ingrese el nombre del cliente: ");
                cliente = caja_reg.next();
   
                System.out.print("Ingrese el número de documento del cliente: ");
                documento = caja_reg.nextInt();

                System.out.print("ingrese producto: ");
                producto = caja_reg.next();

                System.out.print("ingrese cantidades del producto: ");
                cantidad = caja_reg.nextInt();

                System.out.print("Ingrese el valor del producto: ");
                valor = caja_reg.nextDouble();

                subtotal = valor * cantidad;
                total+= subtotal;
  
                System.out.print("Venta: " + (i+1) + " ");
                System.out.println("Cajero: " + cajero);
                System.out.println("Cliente: " + cliente);
                System.out.println("Documento: " + documento);
                System.out.print("Producto: " + producto);
                System.out.print(" Cantidad: " + cantidad);
                System.out.println(" Valor: " + valor);
                System.out.println("Total: " + total);

                double compra = total;
                double  pago, Total;
   
                System.out.println("El cliente tiene que pagar: " + compra);
                System.out.print("El cliente paga: ");
                pago = caja_reg.nextDouble();
   
                Total = pago - compra;
            
                if (pago > compra) {
                    System.out.println("El cambio para dar al cliente es de: " + Total);
                } else {
                    System.out.println("Monto Completo");
                }
            }
            
            
            System.out.println("Deseas hacer otra venta?");
            System.out.println("1. SI / 2. NO");
            decision = caja_reg.nextInt();
            n++;

            } while (decision == 1);

            System.out.println("Gracias por usar mi Software ^_~");
            caja_reg.close();
            }
        }
    }