package ProjectoJava8;
import java.util.Scanner;
public class ProjectoJava8 {
    public static void main(String[] args) {
        //llamar a la fusion escaner
        Scanner vble = new Scanner (System.in);
        
        System.out.println("ingrese el numero");
        System.out.println("ingrese el segundo numero");
        //Usamos operadores de igualdad
        int vble1 = 10;
        int vble2 = 20;
        //Validamos la relacion de los valores
    if (vble1 != vble2)
        System.out.println(" 10 != 20"+" es diferente");

    if (vble1 < vble2)
        System.out.println(" 10 < 20"+" es menor");

    if (vble1 <= vble2)
        System.out.println(" 10 <= 20"+"es menor o igual");
    }
}