package capturanumero;

import java.util.Scanner;

public class Capturanumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = sc.nextInt();
        
        int resultado = (numero*2)*25;
        
        System.out.println("Su resultado es: "+ resultado);
    }
    
}
