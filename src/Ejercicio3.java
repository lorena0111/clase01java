/*3. Escribe un programa Java que lee un número entero por teclado y obtiene y
muestra por pantalla el doble y el triple de ese número.*/
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        var entrada= new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        var numero= entrada.nextInt();
        var doble= dobleNumero(numero);
        System.out.println("El doble de "+numero+" es "+ doble);
        var triple= tripleNumero(numero);
        System.out.println("El triple de "+numero+" es "+ triple);

    }
    public static int dobleNumero(int numero) {
        numero *= 2;
        return numero;   
    }
    public static int tripleNumero(int numero) {
        numero *= 3;
        return numero;
    }
}