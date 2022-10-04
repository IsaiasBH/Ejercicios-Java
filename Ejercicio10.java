package tallerdeprogramacion;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Datos de entrada
        System.out.print("Costo de compra: ");
        int costoCompra = sc.nextInt();

        System.out.print("Tipo de producto [P]erecedero, [N]o perecedero: ");
        String tipoPrducto = sc.next();

        System.out.print("Tipo de conservacion [F]rio, [A]mbiente: ");
        String tipoConservacion = sc.next();

        System.out.print("Periodo de conservacion (dias): ");
        int periodoConservacion = sc.nextInt();

        System.out.print("Periodo de almacenamiento (dias): ");
        int periodoAlmacenamiento = sc.nextInt();

        System.out.print("Volumen (litros): ");
        int volumen = sc.nextInt();

        System.out.print("Medio de almacenamiento [N]evera, [C]ongelador, [E]stanteria, [G]uacal: ");
        String medioAlmacenamiento = sc.next();

        // Calculos
        int ca = calcularCostoAlmacenamiento(costoCompra, periodoConservacion, tipoConservacion, volumen, tipoPrducto, periodoAlmacenamiento);
        float pdp = calcularDepreciacionProducto(periodoAlmacenamiento);
        int ce = calcularCostoExibicion(tipoPrducto, medioAlmacenamiento, ca);
        int vr_p = (int) ((costoCompra + ca + ce) * pdp);
        int vr_v = 0;
        
        if (tipoPrducto.equalsIgnoreCase("P")) {//perecedero
            vr_v = (int) (vr_p * 1.4);
        } else { // no Perecederos
            vr_v = (int) (vr_p * 1.2);
        }

        // Salidas
        System.out.println("*** CALCULOS ***");
        System.out.println("Costos del almacenamiento: " + ca);
        System.out.println("Costo de exhibicion: " + ce);
        System.out.println("Porcentaje de depreciacion:  " + pdp);
        System.out.println("Valor producto: " + vr_p);
        System.out.println("Valor venta: " + vr_v);

    }

    // Subprogramas

    public static int calcularCostoAlmacenamiento(int costoCompra, int periodoConservacion, String tipoConservacion, int volumen,
            String tipoProducto, int periodoAlmacenamiento) {

        if (tipoProducto.equalsIgnoreCase("P")) { // Perecederos
            if (tipoConservacion.equalsIgnoreCase("F")) { // Frio
                if (periodoConservacion < 10) {
                    return (int) (costoCompra * 0.05);
                } else {
                    return (int) (costoCompra * 0.1);
                }
            } else { // ambiente
                if (periodoAlmacenamiento < 20) {
                    return (int) (costoCompra * 0.03);
                } else if (periodoAlmacenamiento > 20) {
                    return (int) (costoCompra * 0.1);
                } else {
                    return (int) (costoCompra * 0.05);
                }
            }
        } else { // No perecederos
            if (volumen >= 50) {
                return (int) (costoCompra * 0.1);
            } else {
                return (int) (costoCompra * 0.2);
            }
        }

    }

    public static float calcularDepreciacionProducto(int peridoAlmacenamiento) {
        if (peridoAlmacenamiento < 30) {
            return 0.95f;
        } else{
            return 0.85f;
        }
    }

    public static int calcularCostoExibicion(String tipoProducto, String medioAlmacenamiento, int ca) {
        if(tipoProducto.equalsIgnoreCase("P")){ // Perecederos
          if(medioAlmacenamiento.equalsIgnoreCase("N")){ // Nevera 
              return ca * 2;
          } else{ // congelador
              return ca;
          }
        }else{ //no perecederos
            if(medioAlmacenamiento.equalsIgnoreCase("E")){
                return (int) (ca * 0.05);
            }else{ //Guacal
                return (int) (ca * 0.07);
            }
        }
    }

}
