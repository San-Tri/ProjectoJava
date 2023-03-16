package projectojava;
import java.util.Scanner;
public class ProjectoJava {

    /*
     Elaborar un algoritmo que permita el ingreso de un número si es mayor o menor que "10"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduse tu nombre");
        String nombre = sc.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        System.out.println("Ingrese un número");
        int número = sc.nextInt();
        if(número<= 10) {
            System.out.println("El número es menor que 10");
}else{
            System.out.println("El número es mayor que 10");
        }
    }
    
}
