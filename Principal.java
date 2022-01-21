import java.util.Scanner;
public class Principal {
 
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        int menu =0;
        do{
            System.out.println("Bienvenidos al menu de algoritmos");
            System.out.println("1 - Ejercicio 1");
            System.out.println("2 - - Ejrcicio 2");
            System.out.println("3 - imprimir el mayor");
            System.out.println("4 - imprimir el menor");
            System.out.println("5 - Redondeo de la division");
            System.out.println("6 - potencia");
            System.out.println("7 - suma");
            System.out.println("8 - Factorial");
            System.out.println("9 - Circulo");
            System.out.println("10 - Multiplos");
            System.out.println("11 - tabla de multiplicar");
            System.out.println("12 - potencia hasta 5");
            System.out.println("13 - divisores");
            System.out.println("14 - numeros del 1 al 5");
            System.out.println("15 - Fin de la compra y total");
            menu=teclado.nextInt();
            String tipo="";

           switch(menu){

            case 1:
            Ejercicio1 ejercicio1 = new Ejercicio1();
            System.out.println(ejercicio1.division());
            break;
            case 2:
            Ejercicio2 ejercicio2 =new Ejercicio2();
            System.out.println(ejercicio2.parimpar());
            break;
            case 3:
            Ejercicio3 ejercicio3 =new Ejercicio3();
            System.out.println(ejercicio3.mayor());
            break;
            case 4:
            Ejercicio4 ejercicio4 =new Ejercicio4();
            System.out.println(ejercicio4.menor());
            break;
            case 5:
            Ejercicio5 ejercicio5 =new Ejercicio5();
            System.out.println(ejercicio5.redondeo());
            break;
            case 6:
            Ejercicio6 ejercicio6 =new Ejercicio6();
            System.out.println(ejercicio6.potencia());
            break;
            case 7:
            Ejercicio7 ejercicio7 =new Ejercicio7();
            System.out.println(ejercicio7.suma());
            break;
            case 8: 
            Ejercicio8 ejercicio8 =new Ejercicio8();
            System.out.println(ejercicio8.factorial());
            break;
            case 9: 
            Ejercicio9 ejercicio9 =new Ejercicio9();
            System.out.println(ejercicio9.circulo());
            break;
            case 10: 
            Ejercicio10 ejercicio10 =new Ejercicio10();
            System.out.println(ejercicio10.multiplo());
            break;
            case 11: 
            Ejercicio11 ejercicio11 =new Ejercicio11();
            System.out.println(ejercicio11.multiplicar());
            break;
            case 12:
            Ejercicio12 ejercicio12 = new Ejercicio12();
            System.out.println(ejercicio12.potencia5());
            break;
            case 13:
            Ejercicio13 ejercicio13 = new Ejercicio13();
            System.out.println(ejercicio13.divisores());
            break;
            case 14:
            Ejercicio14 ejercicio14 = new Ejercicio14();
            System.out.println(ejercicio14.imprimir50());
            break;
            default: 
            tipo="error";
            break;
            

           }
          
        }while (menu!=15); 
        
        

        
    }
}