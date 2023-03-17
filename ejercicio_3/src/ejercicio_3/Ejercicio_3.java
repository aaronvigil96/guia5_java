/*
    Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
    El programa mostrará dónde se encuentra el numero y si se encuentra repetido
*/

package ejercicio_3;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numUsuario, opcion, numBuscar;
        boolean bucle = true;
        System.out.print("Ingresá la cantidad de numeros: ");
        numUsuario = entrada.nextInt();
        int[] numeros = new int[numUsuario];
        llenarVector(numeros);
        while(bucle){
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Buscar numero");
            System.out.println("2)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    System.out.print("Ingresa el numero a buscar: ");
                    numBuscar = entrada.nextInt();
                    buscarNumero(numeros, numBuscar);
                    break;
                }
                case 2: {
                    bucle = false;
                    break;
                }
            }
        }
        System.out.println("Gracias por utilizar la aplicación");
    }
    public static void llenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*2);
            System.out.println(vector[i]);
        }
    }
    public static void buscarNumero(int[] vector,int numero){
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == numero){
                contador = contador + 1;
                System.out.println("---------------------------------");
                System.out.println("El numero está en la posición: " + i);
                System.out.println("---------------------------------");
            }
        }
        if(contador > 1) {
            System.out.println("El numero está repetido " + contador + " veces.");
        }
    }
    
}
