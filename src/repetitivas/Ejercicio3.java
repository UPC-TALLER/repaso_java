package repetitivas;

/*Una empresa desea una aplicación para contabilizar la cantidad de dígitos repetidos dentro de una cadena de números ingresados. Por ejemplo, si tengo el siguiente número 45776574367321367112 y pido que el número a contabilizar sea el 7 entonces debo obtener 5 como valor resultante. La cifra indicada puede tener diferente longitud.
        Desarrollar un subprograma que permita contar la cantidad total de dígitos.
        Desarrollar un subprograma que permita contar la cantidad de números repetidos de acuerdo al digito indicado.*/


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //declarando variables
        long numero;
        int digito;

        //Scanner par ael ingreso de datos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número: " );
        numero = sc.nextLong();

        System.out.println("Ingrese el dígito a buscar: ");
        digito = sc.nextInt();

        //Probar el método cantidadDigitos
        int totaldigitos = cantidadDigitos(numero);
        System.out.println("El número total de dígitos es: " + totaldigitos);

        //probar el método contarDigitosRepetidos
        int digitosRepetidos = contarDigitosRepetidos(numero,digito);
        System.out.println("la cantidad de digitos repetidos es: " + digitosRepetidos);

    }
    //subprograma que permita contar la cantidad total de dígitos
    static int cantidadDigitos(long numero ){
        int contador = 0;
        while (numero > 0){
            contador += 1; //contador = contador +1
            numero /= 10; // numero  = numero / 10
        }

        return contador;
    }

    //subprograma que permita contar la cantidad de números repetidos
    static int contarDigitosRepetidos(long numero, int digito){
        int contador = 0;
        while (numero > 0){
            if (numero % 10 == digito){
                contador +=1; //contador = contador + 1
            }
            numero = numero / 10;
        }
    return contador;
    }
}
