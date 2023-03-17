package projectojava;
//importar la clase Scanner
import java.util.Scanner;
public class ProjectoJava {

    /*
     Elaborar un algoritmo que permita el ingreso de un número si es mayor o menor que "10"
     */
    public static void main(String[] args) {
        //llamar a la funcion escaner
        Scanner name = new Scanner (System.in);
        //pedir al usuario su nombre
        System.out.println("Introduse tu nombre");
        String nombre = name.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        //pedir al usuario que ingrese un número
        System.out.println("Ingrese un número");
        int número = name.nextInt();
        //usar una condicional para ejecutar una condicion
        if(número<= 10) {
            System.out.println("El número es menor que 10");
}else{
            System.out.println("El número es mayor que 10");
        }
    }
    
}
