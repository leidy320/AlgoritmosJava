/*Escriba un programa que pida un número N e imprima todos los divisores de N. */

import java.util.Scanner;
class Ejercicio13 {
    public String divisores(){

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("ingrese el numero que se desea sacar divisores");
        n = input.nextInt();
        for(int i=1; i<= n;i++)
        {
             
            int div= n%i;
            if(div==0){
                System.out.println( i );


            }
           
        }
        return " ejercicio terminado";

    }
    
}
