/*
    Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
*/
package ejercicio_1;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] equipo = new String[5];
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingresa el nombre de un compañero");
            equipo[i] = entrada.nextLine();
            System.out.println(equipo[i]);
        }
    }
    
}
