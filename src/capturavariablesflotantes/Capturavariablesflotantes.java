package capturavariablesflotantes;

import java.util.Scanner;

public class Capturavariablesflotantes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su primer numero");
        float numero1 = sc.nextFloat();
        System.out.println("Ingrese su segundo numero");
        float numero2 = sc.nextFloat();
        System.out.println("Ingrese su tercer numero");
        float numero3 = sc.nextFloat();
        System.out.println("Ingrese su cuarto numero");
        float numero4 = sc.nextFloat();
        
        float producto = numero1*numero2*numero3*numero4;
        float suma = numero1+numero2+numero3+numero4;
        float promedio = suma/4;
        
        System.out.println("El producto de sus numeros es: " + producto);
        System.out.println("La suma de sus numeros es: " + suma);
        System.out.println("El promedio de sus numeros es: " + promedio);
        
    }
    
}
