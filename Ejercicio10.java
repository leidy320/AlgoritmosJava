/*Escriba un programa que pida un número N e imprima en pantalla todos los múlti-
plos de dicho número entre 1 y 100.*/

import java.util.Scanner;
public class Ejercicio10 {

    public String multiplo(){
     
        Scanner input =new Scanner(System.in);
        int n;
        String multiplos="";
        System.out.println("ingrese el numero que se desea ver los multiplos");
        n=input.nextInt();

        for(int i=1;i<=100; i++){
         
            if(i%n==0){
 
                System.out.println(i);
                
            }
        }
        return "fin programa";
    }
}
