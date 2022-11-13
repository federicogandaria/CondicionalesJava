//La video tienda que presta sus servicios de alquiler de películas a los usuarios del barrio el Porvenir,
//// requiere de una aplicación que permita registrar el alquiler de las películas que adquieren sus usuarios.
//// Para cada usuario se debe permitir la opción de alquilar película
//// , consultar películas disponibles y recibir película en la video
//// tienda con la opción de realizar anotaciones sobre estas si se llegan a presentar
//// daños u otra novedad sobre la película.

import java.util.Scanner;

public class CondicionalesReto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        var usuario = sc.nextLine();

        System.out.println("\n Presione 1 para Alquilar película \n" +" "+ "Presione 2 para Consultar película disponible \n" + " "+ "Presione 3 para  recibir película en tienda" );

        var opcion = sc.nextInt();

        switch (opcion) {
            case 1 :
                System.out.println("Seleccionaste la opción de Alquilar película");
                break;
            case 2:
                System.out.println("\n Las películas disponibles son: \n 1-Thor \n 2-Batman \n 3- Titanic");
                break;

            case 3:{
                System.out.println("Recibirás tu película en la tienda");
                System.out.println("Desea registrar algún detalle? SI/NO");


                var respuesta = sc.next();
                respuesta = respuesta.toUpperCase().trim();


                if(respuesta.equals("SI") ){

                    System.out.println("Escriba el detalle");
                    var detalle = sc.next();
                    System.out.println("Detalle guardado");
                    break;
                }
            }


        }

    }    }
