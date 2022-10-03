package tallerdeprogramacion;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        // Datos de entrada
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        
        if (num1 % num2 == 0){
            
            System.out.println("El numero " +num2+ ", es multiplo de " +num1);
    }
        else{
             System.out.println("El numero " +num2+ ", no es multiplo de " +num1);
        }
    }
}
