/*Escriba un programa que pida un número N e imprima todas las potencias desde N1
hasta N5*/
import java.util.Scanner;
class Ejercicio12{
    
    public String potencia5(){

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("ingrese el numero que se desea sacar potencia");
        n = input.nextInt();
        for(int i=1; i<= 5;i++)
        {

            System.out.println(""+n +"^" + i+ "="+Math.round( Math.pow(n, i)) );

        }
        return " ejercicio terminado";

    }
    
}