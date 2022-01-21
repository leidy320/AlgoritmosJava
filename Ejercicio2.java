/*Escriba un programa que pida un número N e imprima en pantalla si es par o impar.*/
import java.util.Scanner;
public class Ejercicio2 {
    
    Scanner input =new Scanner(System.in);
    public String parimpar (){
     
        int num;
        String r;
        System.out.println("ingrese un número para saber si es par o impar");
        num= input.nextInt();
        if(num%2==0){
          r="El numero es par";
        }
        else{
          r="El numero es impar";
        }
        return ""+ r ;
    }
}
