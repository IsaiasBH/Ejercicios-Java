package tallerdeprogramacion;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos de entrada
        System.out.print("Ingrese el año: ");
        int anho = sc.nextInt();

        // Preguntamos si el anho es bisiesto
        
        if(esBisiesto(anho)){
            System.out.println("El " +anho+ " si es bisiesto");
        }else{
            System.out.println("El " +anho+ " no es bisiesto");
        }
    }
    // Funcion o metodo para determinar si un anho es biciesto o no
    public static boolean esBisiesto(int anho) {
        if (anho % 4 == 0) {
            if (anho % 100 == 0) {
                if (anho % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
