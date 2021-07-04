/*Escribe un programa java que lea una variable de tipo entero y asígnale un valor.
A continuación muestra un mensaje indicando si la variable es par o impar.
Utiliza el operador condicional ( ? : ) para resolverlo.
Ej: “14 es par” o “15 es impar”*/
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        var entrada= new Scanner(System.in);
        int numero= 27;
        String resultado;
        resultado= (numero%2==0) ? "par": "impar";
        //if (numero%2==0)
           // System.out.println("El número es par");
        //else
            System.out.println(+ numero +" es "+ resultado );

        
    }
    
}
