/*Escriba un programa que pida dos números A y B e imprima en pantalla el mayor.*/
import java.util.Scanner;
public class Ejercicio3 {
    
    public String mayor(){

        Scanner input =new Scanner(System.in);
        int a;
        int b;
        String r="";
        System.out.println("ingrese primer numero ");
        a=input.nextInt();
        System.out.println("ingrese segundo numero");
        b=input.nextInt();

        if(a>b){
            r=" el numero mayor es " + a;
        }else{
            if(b>a){
             r=" el numero mayor es " + b;
        }
          }
      
          return "  " + r;  
      }
}
