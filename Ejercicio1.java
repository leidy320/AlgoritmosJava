/*1. Escriba un programa que pida dos números A y B e imprima en pantalla el residuo
de la división A/B.*/

import java.util.Scanner;

public class Ejercicio1 {

    Scanner input = new Scanner(System.in);

   public String division(){
      
    int a;
    int b;
    System.out.println("ingresa numero 1");
    a=input.nextInt();
    System.out.println("ingresa numero 2");
    b=input.nextInt();

    return "el resultado es "+ a%b;


   }
}
