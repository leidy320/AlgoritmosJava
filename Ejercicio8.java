/*Escriba un programa que pida un número N e imprima en pantalla su factorial.*/
import java.util.Scanner;
public class Ejercicio8 {
    public String factorial(){


        Scanner input =new Scanner(System.in);
        int n;
        int factorial=1;
       System.out.println("cuantos numeros quiere sumar");
       n=input.nextInt();
       for(int i=1; i<=n;i++){
        
         factorial= factorial*i;

       }
       
       return "el facorial es es "+ factorial
       ;
    

    }
    
}
