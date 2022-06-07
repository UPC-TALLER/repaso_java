package oop;

public class Persona {
    //declarando atributos
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int anhonacimiento;

    //declarando al constructor de la clase Persona
    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad,int anhonacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anhonacimiento = anhonacimiento;
    }

    //médoto imprimir
    void imprimir(){
        System.out.println("nombre : " + nombre);
        System.out.println("apellidos : " + apellidos);
        System.out.println("numeroDocumentoIdentidad : " + numeroDocumentoIdentidad);
        System.out.println("anhonacimiento : " + anhonacimiento);
    }
}
