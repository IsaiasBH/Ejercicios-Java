package tallerdeprogramacion;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos de entrada
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();

        // Realizamos las comparaciones
        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es:" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es:" + num2);
        } else {
            System.out.println("El numero mayor es:" + num3);
        }

    }
}
