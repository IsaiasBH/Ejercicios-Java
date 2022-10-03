package tallerdeprogramacion;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos de entrada
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es: " + num1);
            if (num2 > num3) {
                System.out.println("El numero medio es: " + num2);
                System.out.println("El numero menor es: " + num3);
            } else {
                System.out.println("El numero medio es: " + num3);
                System.out.println("El numero menor es: " + num2);
            }
            
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es: " + num2);
            if (num1 > num3) {
                System.out.println("El numero medio es: " + num1);
                System.out.println("El numero menor es: " + num3);
            } else {
                System.out.println("El numero medio es: " + num3);
                System.out.println("El numero menor es: " + num1);
            }
            
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El numero mayor es: " + num3);
            if (num2 > num1) {
                System.out.println("El numero medio es: " + num2);
                System.out.println("El numero menor es: " + num1);
            } else {
                System.out.println("El numero medio es: " + num1);
                System.out.println("El numero menor es: " + num2);
            }
        }

    }
}
