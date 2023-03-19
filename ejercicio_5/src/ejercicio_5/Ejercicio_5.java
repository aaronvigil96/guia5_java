/*
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
    La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
*/
package ejercicio_5;

public class Ejercicio_5 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
            }
        }
        
        System.out.println("Matriz original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz trasversal:");
        int auxiliar;   
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                auxiliar = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = auxiliar;
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
