package tallerdeprogramacion;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Datos de entrada
        
        System.out.print("Peso de la mercancia: ");
        int peso = sc.nextInt();
        
        System.out.print("Valor de la mercancia: ");
        int valorMercancia = sc.nextInt();
        
        System.out.print("Es lunes [S]i [N]o: ");
        String eslunes = sc.next();
        
        System.out.print("Tipo de pago [E]fectivo [T]argeta: ");
        String medioPago = sc.next();
        
        // Calculos
        
        int tarifas = calcularTarifas(peso);
        int descuentos = calcularDescuentos(valorMercancia, tarifas);
        int promociones = calcularPromociones(eslunes, medioPago, valorMercancia, tarifas);
        
        // Salidas
        
        if(promociones > 0){
            System.out.println("Tarifa: " +tarifas);
            System.out.println("Promocion: " +promociones);
            System.out.println("Total a pagar " +(tarifas - promociones));
        }else{
            System.out.println("Tarifa: " +tarifas);
            System.out.println("Descuento: " +descuentos);
            System.out.println("Total a pagar " +(tarifas - descuentos));
        }
    }
    // Subprogramas
    
    public static int calcularTarifas(int peso){
        int tarifa = 0;
        
        if(peso < 100){
            tarifa = 20000;
        }else if(peso >= 100 && peso <= 150){
            tarifa = 25000;
        }else if(peso > 150 && peso <= 200){
            tarifa = 30000;
        }else{
            tarifa = 35000 + (peso - 200) / 10 * 2000;
        }
        return tarifa;
    }
    
    public static int calcularDescuentos(int valorMercancia, int tarifa){
        int dcto = 0;
        if(valorMercancia >= 300000 && valorMercancia <= 600000 ){
            dcto = (int) (tarifa * 0.1);
        }else if (valorMercancia > 600000 && valorMercancia <= 1000000){
            dcto = (int) (tarifa * 0.2);
        }else{
            dcto = (int) (tarifa * 0.3);
        }
        return dcto;
    }
    
    public static int calcularPromociones(String eslunes, String medioPago, int valorMercancia , int tarifa){
        
        int promocion = 0;
        
        if(eslunes.equalsIgnoreCase("S") && medioPago.equalsIgnoreCase("T") ){
            promocion = (int) (tarifa * 0.5);
        }else if(medioPago.equalsIgnoreCase("E") && valorMercancia > 1000000){
            promocion = (int) (tarifa * 0.6);
        }
        return promocion;
    }
    
}
