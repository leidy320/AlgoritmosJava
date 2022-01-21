/*Escriba un programa que pida un número N e imprima el perímetro y área de un
círculo con radio N. Nota: use 3.1416 como una aproximación de pi.*/
import java.util.Scanner;
public class Ejercicio9 {
    public String circulo(){
        Scanner input =new Scanner(System.in);
        int n;
        double perimetro;
        double area;
       
       System.out.println("ingrese radio del circulo");
       n=input.nextInt();
       perimetro=2*3.1416*n;
       area= 3.1416*n*n;

     
       return "el area del circulo es  "+ area + "el perimetro del circulo es" +perimetro;
       

    }
    
}
