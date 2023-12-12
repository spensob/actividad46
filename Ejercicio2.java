/**
 * Este programa crea un array 10x10 e introduce los valores de las tablas de multiplicar del 1 al 10
 * 
 * @author Sergio Peña
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        int array[][] = new int[10][10]; // Creo el array de tamaño 10x10

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = i * (j + 1); // Cada indice tendrá la multiplicación de i * j (j empieza desde 1) (0 x 1, 0 x 1, 0 x 10, 1 x 1, 1 x 2, etc..)
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]); // Muestro el array
            }
        }
    }
}
