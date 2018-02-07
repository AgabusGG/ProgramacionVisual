
package progrmacionvisual;

import java.util.Scanner;

public class Programa_05 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int mes = 0;
        System.out.println("Hola, dime un numero del uno al doce, para saber un mes y cuantos dias tiene: ");
        mes = teclado.nextInt();
        if(mes == 1){
            System.out.println("El mes es Enero y tiene 31 días");
        }
        else if(mes == 2){
            System.out.println("El mes es Febrero y tiene 28 días sí es 2018");
        }
        else if(mes == 3){
            System.out.println("El mes es Marzo y tiene 31 días");
        }
        else if(mes == 4){
            System.out.println("El mes es Abril y tiene 30 días");
        }
        else if(mes == 5){
            System.out.println("El mes es Mayo y tiene 31 días");
        }
        else if(mes == 6){
            System.out.println("El mes es Junio y tiene 30 días");
        }
        else if(mes == 7){
            System.out.println("El mes es Julio y tiene 31 días");
        }
        else if(mes == 8){
            System.out.println("El mes es Agosto y tiene 31 días");
        }
        else if(mes == 9){
            System.out.println("El mes es Septiembre y tiene 30 días");
        }
        else if(mes == 10){
            System.out.println("El mes es Octubre y tiene 31 días");
        }
        else if(mes == 11){
            System.out.println("El mes es Noviembre y tiene 30 días");
        }
        else if(mes == 12){
            System.out.println("El mes es Dicimbre y tiene 31 días");
        }
        else{
            System.out.println("Ese mes no esxiste, TONTO!!");
        }
    }
}
