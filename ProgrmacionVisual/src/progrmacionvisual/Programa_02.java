
package progrmacionvisual;

import java.util.Scanner;

public class Programa_02 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido1, apellido2;
        System.out.println("Hola usuario");
        System.out.println("Inroduce tu nombre: ");
        nombre = teclado.next();
        System.out.println("Inroduce tu apellido paterno: ");
        apellido1 = teclado.next();
        System.out.println("Inroduce tu apellido materno: ");
        apellido2 = teclado.next();
        System.out.println("Hola "+nombre+" "+apellido1+" "+apellido2);
    }
}
