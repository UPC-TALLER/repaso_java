package repetitivas;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //declarando las variables
        int n;
        String tipoTrabajador;
        double sueldo;

        //Scanner para el ingreso de Datos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar el número de años: ");
        n = sc.nextInt();

        System.out.println("Ingresar el tipo de trabajador");
        tipoTrabajador = sc.nextLine();

        System.out.println("Ingresar el sueldo: ");
        sueldo = sc.nextDouble();

        //probar el método calculoSueldoNanhos


        //probar el médoto calculoPorcentajeAumento

    }

    static double calculoSueldoNanhos(int n, String tipoTrabajador, double sueldo){
        double nuevoSueldo = sueldo;
        if (tipoTrabajador.equals("g")){
            for (int i=1; i<= n; i++){
                if (i % 4 ==0){
                    nuevoSueldo = nuevoSueldo + nuevoSueldo * 0.18;
                }else{
                    nuevoSueldo = nuevoSueldo + nuevoSueldo * 0.14;
                }
            }
        }else{
            for (int i=1; i<= n; i++){
                if (i % 4 ==0){
                    nuevoSueldo = nuevoSueldo + nuevoSueldo * 0.12;
                }else{
                    nuevoSueldo = nuevoSueldo + nuevoSueldo * 0.08;
                }
            }

        }
        return nuevoSueldo;

    }

    static double calculoPorcentajeAumento(int n, String tipoTrabajador,double sueldo){
        double total = calculoSueldoNanhos(n,tipoTrabajador,sueldo);
        double porcentaje = (total-sueldo)/sueldo;
        return porcentaje;
    }

}
