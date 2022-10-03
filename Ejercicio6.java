package tallerdeprogramacion;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Datos de entrada
        
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese el numero de horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();
        
        System.out.print("Ingrese el valor de la hora: ");
        int valorHora = sc.nextInt();
       
        System.out.print("Ingrese el salario minimo mensual: ");
        int salarioMinimo = sc.nextInt();
        
        int salarioMensual = (horasTrabajadas * valorHora);
        
        // Calculos 
        
        if(salarioMensual > salarioMinimo){
            System.out.println("Nombre: " +nombre);
            System.out.println("Salario: " +salarioMensual);
        }else{
            System.out.println("Nombre: " +nombre);
        }
    }
    
}
