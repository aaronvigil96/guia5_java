/*
    Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
*/
package ejercicio_2;

public class Ejercicio_2 {
    public static void main(String[] args) {
       int[] numeros = new int[101];
       int contador = numeros.length;
        for (int i = 100; i < contador; i--) {
            if(i != 0){
                numeros[i] = i;
                System.out.println(numeros[i]);
            }
        }
    }
}
