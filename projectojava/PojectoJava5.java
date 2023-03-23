package java8.pkg46;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Java846 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa el número a mostrar: ");
        int n = dato.nextInt();
        //Parte II
        int sum = 0;
        int i;
        for (i=0; i<=n;i+=2) {
            sum = sum + i;
            System.out.println("Numeros pares:"+i);    
            
        }
        System.out.println("La suma es:"+sum); 
        }
    }
