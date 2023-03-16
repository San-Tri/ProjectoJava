package projectojava;
import java.util.Scanner;
public class ProjectoJava {

    /*
     Elaborar un algoritmo que permita el ingreso de un número si es mayor o menor que "10"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduse tu nombre");
        String nombre;
        Scanner teclado = new Scanner(System.in);
        nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        int número = sc.nextLine();
        if(número<= 10) {
            System.out.println("El número es menor que 10");
    }else{
        System.out.println("El número es menor que 10");
    }
        }
    
}
