import java.util.Scanner;

public class CajaRegistradoraSwitch {

    public static void main(String[] args) {
        final double IVA = 0.19;
        final double PRECIO_BASICO = 65000;
        final double PRECIO_MEDIO = 85000;
        final double PRECIO_PREMIUM = 105000;
        double totalCompra = 0.0;
        double totalBruto = 0.0;
        double totalFactura = 0.0;
        double porcentajePremium = 0.0;
        int opcionCliente;
        int contPremium = 0;
        int contProductos = 0;
        Scanner consola = new Scanner (System.in);
        
          do {
            System.out.println("Menú:");
            System.out.println("1: Producto Basico");
            System.out.println("2: Producto Medio");
            System.out.println("3: Producto Premium");
            System.out.println("4: Finalizar compra");

            opcionCliente = consola.nextInt();
            
            switch (opcionCliente) {
                case 1:
                    totalBruto += PRECIO_BASICO;
                    contProductos ++;
                    break;
                case 2:
                    totalBruto += PRECIO_MEDIO;
                    contProductos ++;
                    break;
                case 3:
                    totalBruto += PRECIO_PREMIUM;
                    contProductos ++;
                    contPremium ++;   
                    break;
                case 4: 
                    System.out.println("Facturación en proceso...");
                default:
                    System.out.println("ingrese una opción correcta del menú");
                    break;
                    
            }

        } while ( opcionCliente != 4); 

        if (totalBruto>100000) {
            totalCompra = totalBruto - totalBruto * 0.10;

        }else if (totalBruto <= 100000) {
            totalCompra = totalBruto;
        }

        totalFactura = totalCompra + totalCompra * IVA;
    
        porcentajePremium = (double) contPremium / contProductos * 100.0;

        System.out.println("el valor bruto fue de: " + totalBruto);
        System.err.println("valor despues de descuento: " +totalCompra);
        System.out.println("Total compra + IVA: " + totalFactura);
        System.out.println("total productos: " + contProductos);
        System.out.println("total productos premium: " + contPremium);
        System.out.println("el porcentaje de productos premium fue de: " + porcentajePremium);

          
        consola.close();
    }

}