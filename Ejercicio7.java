package tallerdeprogramacion;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos de entrada
        System.out.print("Ingrese el numero de escritorios: ");
        int numeroEscritorios = sc.nextInt();

        int valorEscritorio = numeroEscritorios * 650000;
        int dcto = 0;

        // Calculos
        if (numeroEscritorios < 5) {
            dcto = (int) (valorEscritorio * 0.1);
        } else if (numeroEscritorios >= 5 && numeroEscritorios < 10) {
            dcto = (int) (valorEscritorio * 0.2);
        } else {
            dcto = (int) (valorEscritorio * 0.4);
        }

        // Mostrar resultados
        System.out.println("Numero de escritorio: " + numeroEscritorios);
        System.out.println("El valor a pagar es:  " + (valorEscritorio - dcto));

    }

}
