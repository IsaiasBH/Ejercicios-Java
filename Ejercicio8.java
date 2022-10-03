
package tallerdeprogramacion;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos de entrada
        
        System.out.print("Ingrese el numero de creditos: ");
        int creditos = sc.nextInt();

        System.out.print("Ingrese el valor de los creditos: ");
        int valorCredito = sc.nextInt();

        System.out.print("Ingrese su estrato: ");
        int estrato = sc.nextInt();
        
        // Calculos
        int matricula = calculoMatricula(creditos, valorCredito, estrato);
        int subsidio = subsidios(estrato);
        
        // Salidas
        
        System.out.println("Costo de la matricula: " +matricula);
        System.out.println("Valor del subsidio: " +subsidio);
    }
    // subprogramas, funciones o metodos
    public static int calculoMatricula(int creditos, int valorCredito, int estrato) {
    
        int valorMatricula = creditos * valorCredito;
        int dcto = 0;
        switch(estrato){
            case 1: dcto = (int) (valorMatricula * 0.8);
            break;
            case 2: dcto = (int) (valorMatricula * 0.5);
            break;
            case 3: dcto = (int) (valorMatricula * 0.3);
            break;
        }
        return valorMatricula - dcto;
    }

    public static int subsidios(int estrato) {
        int subsidio = 0;
        switch(estrato){
            case 1: subsidio = 200000; 
            break;
            case 2: subsidio = 100000; 
            break;
        }
        return subsidio;
    }
}
