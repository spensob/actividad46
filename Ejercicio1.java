/**
 * Este programa crea un array 5x5 y almacena los numeros del 1 al 25 y los muestra por pantalla
 * 
 * @author Sergio Peña
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        int contador = 1; // Contador para añadir los numeros desde el 1 al 25

        while (contador <= 25) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = contador;
                    contador++; // Añado al array el contador
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]); // Muestro el array completo
            }
        }
    }
}