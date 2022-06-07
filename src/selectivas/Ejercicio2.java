package selectivas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //declarando variables
        double examenEscrito;
        double examenOral;

        //Scanner para el ingreso de datos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota del examen escrito: ");
        examenEscrito = sc.nextDouble();

        System.out.println("Ingrese la nota del examen oral");
        examenOral = sc.nextDouble();

        //probar metodo determinarNivel
        int nivel = determinarNivel(examenEscrito, examenOral);
        System.out.println("El nivel es: " + nivel);

        //probar método determinarPrecio
        double precio;
        precio = determinarPrecio(examenEscrito,examenOral);
        System.out.println("El precio a pagar es de: " + precio);

    }

    static int determinarNivel(double examenEscrito, double examenOral){
        int nivel = 0;
        if (examenEscrito > 95 && examenOral > 75){
            nivel = 3;
        }else if (examenEscrito > 95 && examenOral <= 75){
            nivel = 2;
        }else if ( examenEscrito <= 95 ){
            nivel = 1;
        }

        return nivel;
    }

   static double determinarPrecio(double examenEscrito, double examenOral){
        int nivel = determinarNivel(examenEscrito,examenOral);
        int precio=0;
        switch (nivel){
            case 1:
                precio = 150;
                break;
            case 2:
                precio = 250;
                break;
            case 3:
                precio = 400;
                break;
        }

        return precio;
    }
}
