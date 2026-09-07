import java.util.Scanner;

public class OfertasNovaventa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ofertas = {"Combo cuidado personal", "Combo Hogar", "Combo Despensa", null, null};
        boolean continuar = true;
        int opcion;
        System.out.println("********** Ofertas Novaventa **********");
        while (continuar) {
            System.out.println("Seleccione una opcion: ");
            System.out.println("Opcion 1: Ver ofertas ");
            System.out.println("Opcion 2: Validar cobertura de Oferta");
            System.out.println("Opcion 3: Registrar Nueva Oferta");
            System.out.println("Opcion 4: Salir ");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                   verOfertas(ofertas);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Ingrese el nombre de la oferta a validar: ");
                    String nombreProducto = sc.nextLine();
                    boolean existeOferta = buscarProducto(ofertas, nombreProducto);
                    if (existeOferta) {
                        System.out.println("La oferta: "+ nombreProducto +" esta vigente");
                        
                    }else{
                        System.out.println("No existe la oferta: "+ nombreProducto);
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Ingrese el nombre de la oferta a Agregar");
                    String ofertaParaAgregar = sc.nextLine();
                    boolean existia = buscarProducto(ofertas, ofertaParaAgregar);
                    if (existia) {
                        System.out.println("La oferta "+ ofertaParaAgregar+" ya existe, no se puede agregar");                        
                    }else{
                        registrarNuevaOferta(ofertas, ofertaParaAgregar);
                        
                    }
                    
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;

            }

        }

    }
    
    public static void verOfertas(String[] productos) {
        System.out.println("Ofertas vigentes: ");
        for (String producto : productos) {
            System.out.println(producto);
        }
    }

    public static boolean buscarProducto(String[] nombreArray, String nombreProducto) { 
        
        for (int i = 0; i < nombreArray.length; i++) {

            try {
                if (nombreArray[i].equals(nombreProducto)) {
                    return true;
                }

            } catch (NullPointerException e) {
                continue;
            }
        
        }
        return false;
     
    }

    public static void registrarNuevaOferta(String[] nombreArray, String nombreProducto) {
        for (int i = 0; i < nombreArray.length; i++) {
            if (nombreArray[i] == null) {
                nombreArray[i] = nombreProducto;
                System.out.println("El nuevo combo : " + nombreProducto+ " ha sido agregado y queda vigente desde ahora.");
                break;
            }
        }

    }
}

