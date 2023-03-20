/*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
    Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
    El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
*/
package ejercicio_6;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int contador = 0;
        int[][] matriz = new int[3][3];
        int[] filas = new int[3];
        int[] columnas = new int[3];
        boolean filasBoolean = false;
        boolean columnasBoolean = false;
        
        //Llenar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random() * 2 + 1);
            }
        }
        
        //Mostrar matriz
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        //Pushear valores
        do{
            filas[contador] = filas(matriz, contador);
            columnas[contador] = columnas(matriz, contador);
            contador += 1;
        }while(contador < 3);
        
        //Comparo filas y columnas
        if(filas[0] == filas[1] && filas[0] == filas[2]){
            filasBoolean = true;
        }
        if(columnas[0] == columnas[1] && columnas[0] == columnas[2]){
            columnasBoolean = true;
        }
        System.out.println(filasBoolean);
        System.out.println(columnasBoolean);
        diagonal(matriz,2);
    }
    
    public static int filas(int[][] matriz,int fila){
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i == fila){
                    contador = contador + matriz[i][j];
                }
            }
        }
        return contador;
    }
    
    public static int columnas(int[][] matriz, int columna){
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(columna == j){
                    contador = contador + matriz[i][j];
                }
            }
        }
        return contador;
    }
    
    public static void diagonal(int[][] matriz, int diagonal){
        //1 normal
        //2 al revés
        int contador = 0;
        if(diagonal == 1){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if(i == j){
                        contador = contador + matriz[i][j];
                    }
                }
            }
        }else if(diagonal == 2){
            for (int i = matriz.length - 1; i >= 0; i--) {
                for (int j = matriz.length - 1; j >= 0; j--) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
