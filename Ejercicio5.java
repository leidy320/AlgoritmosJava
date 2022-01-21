/*Escriba un programa que pida dos números A y B e imprima en pantalla la división
A/B con redondeo.*/
import java.util.Scanner;
public class Ejercicio5 {
    public String redondeo (){
        
        Scanner input =new Scanner(System.in);
        int a;
        int b;
     
        System.out.println("ingrese primer numero ");
        a=input.nextInt();
        System.out.println("ingrese segundo numero");
        b=input.nextInt();
         

        int r= Math.round(a/b);
      
          return "el resultado es " + r;  
    }
    
}
