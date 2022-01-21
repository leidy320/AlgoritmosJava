/*Escriba un programa que pida dos números A y B e imprima en pantalla la potencia
AB, sin hacer uso de librerías matemáticas.*/
import java.util.Scanner;
public class Ejercicio6 {
   
    public String potencia(){
        Scanner input =new Scanner(System.in);
        int a;
        int b;
     
        System.out.println("ingrese primer numero ");
        a=input.nextInt();
        System.out.println("ingrese segundo numero para la potencia");
        b=input.nextInt();
         

       double r= Math.pow(a, b);
      
          return "el resultado es " + r;  
    }
}
