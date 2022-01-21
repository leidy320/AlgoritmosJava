/*Escriba un programa que pida un número N e imprima en pantalla su tabla de mul-
tiplicar hasta 10xN.*/
import java.util.Scanner;
public class Ejercicio11 {

    public String multiplicar(){
     
        Scanner input =new Scanner(System.in);
        int n;
        String multiplicar="";
        System.out.println("ingrese el numero de la tabla de multiplicar que desea ver");
        n=input.nextInt();

        for(int i=1;i<=10; i++){
         
           System.out.println(""+n+" x "+i+" = "+i*n); 
        }
        return "fin de programa" ;
    }
}