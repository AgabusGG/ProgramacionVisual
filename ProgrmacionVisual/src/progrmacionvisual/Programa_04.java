
package progrmacionvisual;

import java.util.Scanner;

public class Programa_04 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int e = 0; //e de edad
        System.out.println("Hola, dime tu edad: ");
        e = teclado.nextInt();
        if((e > 0)&&(e <= 5)){
            System.out.println("Pichón");
        }
        else if((e > 5)&&(e <= 15)){
            System.out.println("Faperro");
        }
        else if((e > 15)&&(e <= 20)){
            System.out.println("Puberto");
        }
        else if((e > 20)&&(e <= 40)){
            System.out.println("Chavo Ruco");
        }
        else if(e > 40){
            System.out.println("Mayor");
        }
        else{
            System.out.println("Estás pichón");
        }
    }
}
