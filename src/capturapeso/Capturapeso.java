package capturapeso;

import java.util.Scanner;

public class Capturapeso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso en libras");
        float libras = sc.nextFloat();
        
        float kilos = (float) (libras * 0.453592);
        float gramos = kilos * 1000;
        
        System.out.println("\nSu peso en Kilogramos es: " + kilos);
        System.out.println("Su peso en Gramos es: " + gramos);
    
    }
    
}
