/*Implemente un algoritmo que reciba un número por
teclado y cuente cuántas cifras (o dígitos) contiene e
imprima el mensaje en consola.*/
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        var entrada= new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        var numero= entrada.nextInt();

        var digitos=numeroDigitos(numero);
        System.out.println("El número tiene "+ digitos + " cifras");    
    }
    public static int numeroDigitos(int numero) {
        var cifras=0;

        while (numero != 0) {
            numero /= 10;
            cifras++;
            
        }
        return cifras;
    }
    
}
