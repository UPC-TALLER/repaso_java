package arreglos;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {

        //declarando array de unidades vendidas
        int [] ventas = {10, 15 , 5 , 2 , 20};

        //declarando array de vendedores
        String [] vendedores = {"Jhon" , "Luciana" , "Mario" , "Angelica" , "Roberto"};

        //probar el método obtenerTotalUnidades
        int sumaTotal= obtenerTotalUnidades(ventas);
        System.out.println("La suma del arreglo ventas es: " + sumaTotal);

        //probar el método obtenerPorcentajeSuperoCuota
        double porcentajeSupero = obtenerPorcentajeSuperoCuota(ventas);
        System.out.println("El porcentaje de vendedores que supero la cuota es: " + porcentajeSupero);

        //probar el método obtenerVendedoresSuperoCuota
        String[] vendedor = obtenerVendedoresSuperoCuota(ventas,vendedores);
        System.out.println("Los vendedores que superaron la cuota son: " + Arrays.toString(vendedor));

        //Probar el método determinarComisionPagar
        double comision =  determinarComisionPagar(ventas);
        System.out.println("Pago por comisión es:" + comision);

    }

    static int obtenerTotalUnidades(int [] ventas){

        int suma = 0;
        for (int i=0; i < ventas.length; i++){
            suma = suma + ventas[i];// suma += ventas[i]
        }

        return suma;

    }

    static double obtenerPorcentajeSuperoCuota(int[] ventas){

        int cantidadSupero = 0;
        for (int i=0 ; i<ventas.length ; i++){
            if (ventas[i] >= 5){
                cantidadSupero +=1;
            }
        }
        double porcentaje = cantidadSupero*100/ ventas.length;
        return porcentaje;
    }

    static String[] obtenerVendedoresSuperoCuota(int[] ventas, String[] vendedores){

        String[] arrayVendedor = new String[vendedores.length];
        int cantidadSupero = 0;
        for (int i=0 ; i<ventas.length ; i++){
            if (ventas[i] >= 5){
                arrayVendedor[cantidadSupero] = vendedores[i];
                cantidadSupero +=1;
            }
        }

        return arrayVendedor;
    }

    static double determinarComisionPagar(int[] ventas){
        int totalUnidadesVendidas = obtenerTotalUnidades(ventas);

        return totalUnidadesVendidas*300;
    }
}
