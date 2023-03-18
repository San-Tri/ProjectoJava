package ProjectoJava3;
//importamos la clase Scanner
import java.util.Scanner;
public class ProjectoJava3 {
    public static void main (String[] args) {
    //llamamos a la funcion Scanner
    Scanner sc = new Scanner(System.in);
    //Pedir el nombre al usuario
    System.out.println("Introduse tu nombre");
    String nombre = name.nextLine();
    System.out.println("¡Hola " + nombre);
    //ponemos el resto de los datos
     Scanner number = new Scanner (System.in);
     System.out.println("Ingrese un número para ralizar la suma");
     int n = number.nextInt();
     int suma = 0;
     for (int numero = 1;numero <=n; numero ++){
         suma = suma + numero;
         
      }
      System.out.println("La suma es:"+ suma);
   }
        
}

