/*Escriba un programa que pida dos números A y B e imprima en pantalla el menor.*/
import java.util.Scanner;
public class Ejercicio4 {
    
public String menor(){
    
    Scanner input =new Scanner(System.in);
    int a;
    int b;
    String r="";
    System.out.println("ingrese primer numero ");
    a=input.nextInt();
    System.out.println("ingrese segundo numero");
    b=input.nextInt();

    if(a<b){
        r=" el numero menor es " + a;
    }else{
        if(b<a){
         r=" el numero menor es " + b;
    }
      }
  
      return "  " + r;  
}
}

