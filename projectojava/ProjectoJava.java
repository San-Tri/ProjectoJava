package projectojava;
import java.util.Scanner;
public class ProjectoJava {

    /*
     Elaborar un algoritmo que permita el ingreso de un número si es mayor o menor que "10"
     */
    public static void main(String[] args) {
        System.out.println("Introduse tu nombre");
        String nombre;
        Scanner teclado = new Scanner(System.in);
        nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        System.out.print("Introduzca primer número: ");
        int x, y;
        x = teclado.nextInt();
        System.out.print("Introduzca segundo número: ");
        y = teclado.nextInt();
        System.out.println(x + "*" + y + "=" + (x*y));
    }
    
}
