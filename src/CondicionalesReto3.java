//La Droguería Mi Salud presta sus servicios en la localidad de Suba y
// requiere una aplicación para poder facturar los productos que vende a sus clientes y para ello,
// los productos tienen unas características que deben indicársele al cliente para que pueda escoger el producto a comprar.
// Para cada cliente, se tienen las opciones de compra de producto, consulta de precios por producto y devoluciones
// en caso de que se presenten.


import java.util.Scanner;

public class CondicionalesReto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Escribe tu nombre:");
        var usuario = sc.nextLine();


        var detergenteRopaPrecio = 40;
        var suavizanteRopaPrecio = 30;
        var perfumadorPrecio = 15;
        var guantesLatexPrecio = 10;

        var simboloDinero = "$";

        System.out.println("<----------Lista de productos ---------->");

        System.out.println("-1:Detergente de ropa espuma controlada para maquina.\n" +
                "Rinde 100 lavados.\n");

        System.out.println("-2:Suavizante para ropa aroma Fresh.\n" + "Pronto para usar\n");

        System.out.println("-3:Perfumador de telas aroma Vainilla\n " +
                "perfuma tus prendas, sábanas, cortinas, alfombras y todo tipo de telas. Es ideal para usar después de lavar sus prendas \n");

        System.out.println("-4:Guantes de latex descartables \n" +
                "Contiene 100 unidades.\n" + "Contiene talco\n");


        System.out.println("Seleccione la opción de su agrado:\n 1-Detergente \n 2-Suavizante \n 3-Perfumador \n 4-Guantes de latex");
        var opcion = sc.nextInt();

        switch (opcion){

            case 1 :
                System.out.println("Seleccionó: Detergente de Ropa \n");
                break;
            case 2 :
                System.out.println("Seleccionó: Suavizante de Ropa \n");
                break;
            case 3 :
                System.out.println("Seleccionó: Perfumador de Telas \n");
                break;
            case 4 :
                System.out.println("Seleccionó: Guantes de Latex \n");
                break;

        }


        System.out.println("Presione 1 para Compra de producto \n" + "Presione 2 para Consulta de precios por producto \n" + "Presione 3 para realizar una devolución" );

        var opcion2 = sc.nextInt();


        switch (opcion2) {
            case 1 :
                System.out.println("Compra de producto");
                break;
            case 2:
                System.out.println("Consultar precios por producto");
                break;

            case 3:{
                System.out.println("Realizar devolución");
            }

        }

         //        CONDICIONALES COMPRA DE PRODUCTO

        if(opcion == 1 && opcion2 ==  1){
            System.out.println("<---------- Factura ----------> \n " + usuario + " " + "gracias por comprar 'Detergente de ropa' a un precio de :"+ simboloDinero+detergenteRopaPrecio);
        } else if (opcion == 2 && opcion2 ==  1) {
            System.out.println("<---------- Factura ----------> \n " + usuario + " " + "gracias por comprar 'Suavizante de ropa' a un precio de :"+ simboloDinero+suavizanteRopaPrecio);
        } else if (opcion == 3 && opcion2 ==  1) {
            System.out.println("<---------- Factura ----------> \n " + usuario + " " + "gracias por comprar 'Perfumador de tela' a un precio de :"+ simboloDinero+perfumadorPrecio);
        } else if (opcion == 4 && opcion2 ==  1) {
            System.out.println("<---------- Factura ----------> \n " + usuario + " " + "gracias por comprar 'Guantes de latex' a un precio de :"+ simboloDinero+guantesLatexPrecio);
        }


        //        CONDICIONALES CONSULTA DE PRECIO
        if(opcion == 1 && opcion2 ==  2){
            System.out.println("El precio del detergente para ropa es de: " + simboloDinero+detergenteRopaPrecio);
        } else if (opcion == 2 && opcion2 ==  2) {
            System.out.println("El precio es del suavizante para ropa es de: " + simboloDinero+suavizanteRopaPrecio);
        } else if (opcion == 3 && opcion2 ==  2) {
            System.out.println("El precio  del perfumador de telas es de: " + simboloDinero+perfumadorPrecio);

        } else if (opcion == 4 && opcion2 ==  2) {
            System.out.println("El precio  de los guantes de latex es de: " + simboloDinero+guantesLatexPrecio);
        }


        //        CONDICIONALES DEVOLUCIÓN
        if(opcion == 1 && opcion2 ==  3){
            System.out.println(" Realizaste la devolución de 'Detergente para Ropa', valor: " + simboloDinero+detergenteRopaPrecio);
        } else if (opcion == 2 && opcion2 ==  3) {
            System.out.println("Realizaste la devolución de 'Suavizante para Ropa', valor: " + simboloDinero+suavizanteRopaPrecio);
        } else if (opcion == 3 && opcion2 ==  3) {
            System.out.println("Realizaste la devolución de 'Perfumador', valor " + simboloDinero+perfumadorPrecio);

        } else if (opcion == 4 && opcion2 ==  3) {
            System.out.println("Realizaste la devolución de 'Guantes de Latex', valor: " + simboloDinero+guantesLatexPrecio);
        }

    }    }