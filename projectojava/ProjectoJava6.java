package ProjectoJava6;
//importar escanner
import java.util.Scanner;
public class ProjectoJava6 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int sumaPares = 0;
        int numero = 0;
        do {
        //pedimos el nombre
        System.out.println("Ingresa el número: ");
        numero = dato.nextInt();
        //evaluar par
        if(numero%2==0)//es par
        sumaPares = sumaPares + numero; //Acumulamos suma
    }while(numero !=0 );
    
    //Bucle terminado, mostramos resultados
    System.out.println("\nLa suma de pares es: " + sumaPares);
    dato.close();
    }
}