/*Implemente un algoritmo que dado un
nombre en una variable de tipo cadena,
imprima un saludo en consola.*/

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        var nombre= ("Lorena Gutierrez");
        var resultado= saludo(nombre);
        System.out.println(resultado);
    }
    public static String saludo(String nombre) {
        return "Hola " + nombre + "!";
        
    }
}