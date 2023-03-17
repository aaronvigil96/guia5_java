/*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package ejercicio_4;
import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroUsuario;
        System.out.println("Ingresá la cantidad maxima de numeros");
        numeroUsuario = entrada.nextInt();
        int[] numeros = new int[numeroUsuario];
        mostrarNumeros(numeros);
    }
    public static void mostrarNumeros(int[] numeros){
        String cadena;
        int contador1 = 0, 
        contador2 = 0,
        contador3 = 0,
        contador4 = 0,
        contador5 = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100000);
            cadena = Integer.toString(numeros[i]);
            System.out.println(cadena + " es un numero de " + cadena.length() + " digitos.");
            switch(cadena.length()){
                case 1: {
                    contador1 = contador1 + 1;
                    break;
                }
                case 2: {
                    contador2 = contador2 + 1;
                    break;
                }
                case 3: {
                    contador3 = contador3 + 1;
                    break;
                }
                case 4: {
                    contador4 = contador4 + 1;
                    break;
                }
                case 5: {
                    contador5 = contador5 + 1;
                    break;
                }
            }
        }
        System.out.println("El total de un dígito es: " + contador1);
        System.out.println("El total de dos dígito es: " + contador2);
        System.out.println("El total de tres dígito es: " + contador3);
        System.out.println("El total de cuatro dígito es: " + contador4);
        System.out.println("El total de cinco dígito es: " + contador5);
    }
    
}
