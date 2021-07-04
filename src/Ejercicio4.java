/*Escribe un programa que lea una cantidad de grados centígrados y la pase a
grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)*/
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        var entrada= new Scanner(System.in);
        System.out.println("Introduzca los grados Centígrados: ");
        var gc= entrada.nextInt();
        System.out.println("Los grados centigrados son "+gc); 
        var f=32 + ( 9 * gc / 5);
        System.out.println("Los grados Fahrenheit son "+f); 
    }
    public static int f(int gc) {
        f==gc
        return f;
        
    }
}