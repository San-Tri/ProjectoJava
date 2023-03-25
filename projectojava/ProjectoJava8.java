package ProjectoJava8;
import java.util.Scanner;
public class ProjectoJava8 {
    public static void main(String[] args) {
        //llamar a la fusion escaner
        Scanner vble = new Scanner (System.in);
        //pedir el ingreso de los numeros
        System.out.println("ingrese el numero: ");
        int n1 = sc.nextInt ();
        System.out.println("ingrese el segundo numero: ");
        int n2 = sc.nextInt ();
        //Usamos operadores de igualdad
        int vble1 = n1;
        int vble2 = n2;
        //Validamos la relacion de los valores
    if (vble1 != vble2) {
        System.out.println( n1 + "!=" + n2 +" es diferente");
    }
    if (vble1 < vble2) {
        System.out.println(n1 + "<" + n2 + " es menor");
    }
    if (vble1 <= vble2) {
        System.out.println(n1 + "<=" + n2 + "es menor o igual");
    }
    }
}