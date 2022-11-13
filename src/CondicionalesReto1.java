
//Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona.
// Si la persona es mayor o igual a 18 años, entonces se deberá imprimir en pantalla [Nombre completo] usted es mayor de edad,
// por lo tanto, puede entrar a la fiesta. Si la edad de la persona es menor que 18 años,
// entonces, deberá imprimirse el siguiente mensaje: [Nombre completo] usted es menor de edad, por lo tanto,
// no puede entrar a la fiesta, por favor devuélvase a su casa.

import java.util.Scanner;

public class CondicionalesReto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        var nombre = sc.nextLine();

        System.out.println("Escribe tus apellidos:");
        var apellidos = sc.nextLine();

        System.out.println("Escribe tu edad:");
        var edad = sc.nextInt();

        var nombreCompleto = nombre + " " + apellidos;

        if(edad >=18){
            System.out.println(nombreCompleto + " usted es mayor de edad, por lo tanto, puede entrar a la fiesta.");
        }else{
            System.out.println(nombreCompleto + " usted es menor de edad, por lo tanto,  no puede entrar a la fiesta, por favor devuélvase a su casa.");
    }}

}
