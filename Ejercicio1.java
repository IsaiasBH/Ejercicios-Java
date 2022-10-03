package tallerdeprogramacion;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int num1 = sc.nextInt();
        
        if (num1 % 2 == 0){
            System.out.println("El numero: " +num1+ " , es par");
        }
        else{
            System.out.println("El numero: " +num1+ " , es impar");
        }
    }
    
}
