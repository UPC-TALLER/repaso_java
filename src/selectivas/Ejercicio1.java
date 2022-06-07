package selectivas;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //declarando variables
        double sueldoBruto;
        double utilidad;
        double impuesto;

        //Scanner para el ingreso de datos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el sueldo bruto: ");
        sueldoBruto = sc.nextDouble();

        System.out.println("Ingrese la utilidad: ");
        utilidad = sc.nextDouble();

        double sueldoAnual = sueldoBruto*14 + utilidad;
        double neto = sueldoAnual - 3600*7;

        if (neto < 0 ){
            impuesto=0;
        }else {
            impuesto = neto*0.21;
        }

        System.out.println("el impuesto es :" + impuesto);

    }


}
