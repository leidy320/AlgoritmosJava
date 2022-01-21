/*Escriba un programa que pida un número N e imprima en pantalla la suma de todos
los números entre 0 y N (incluyéndose el mismo).*/
import java.util.Scanner;
public class Ejercicio7 {
   
    public String suma (){
        Scanner input =new Scanner(System.in);
        int n;
        int suma=0;
       System.out.println("cuantos numeros quiere sumar");
       n=input.nextInt();
       for(int i=1; i<=n;i++){
        
         suma= suma+i;

       }
       
       return "la suma total es "+ suma;
    }
}
