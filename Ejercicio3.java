/**
 * Este programa crea una matriz (an x al) dependiendo de los valores introducidos por el usuario introducido por teclado.
 * El array se rellenará con valores (an x al) dependiendo también de los valores introducidos por el usuario por teclado.
 * 
 * @author Sergio Peña
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        // Pido los datos por teclado
        System.out.println("Introduce las filas del array:");
        String fila = System.console().readLine();
        int filaInt = Integer.parseInt(fila);
        
        System.out.println("Introduce las columnas del array:");
        String columna = System.console().readLine();
        int columnaInt = Integer.parseInt(columna);

        int array[][] = new int[filaInt][columnaInt]; // Creo un array con una longitud según el ancho y alto introducidos por teclado

        int mayoresCero = 0;
        int igualesACero = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < columnaInt; j++) {
                System.out.println("Introduce el valor para la fila " + (i + 1) + ", columna " + (j + 1));
                String valor = System.console().readLine();
                int valorInt = Integer.parseInt(valor);
                array[i][j] = valorInt; // Pido los datos y los introduzco en el array
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < columnaInt; j++) {
                if(array[i][j] > 0){ // Aumento la variable en 1 si el valor del índice del array actual es mayor de 0
                    mayoresCero++;
                }
                else if(array[i][j] == 0){
                    igualesACero++; // Aumento la variable en 1 si el valor del índice del array actual es igual a 0
                }
            }
        }

        System.out.println("Hay " + mayoresCero + " valores mayores que cero");
        System.out.println("Hay " + igualesACero + " valores iguales a cero");
    }
}
