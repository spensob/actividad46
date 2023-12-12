/**
 * Este programa crea un array con una longitud determinada por el usuario por teclado, luego pide el genero y sueldo de cada persona y muestra las medias de cada genero
 * 
 * @author Sergio Peña
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        // Pido la cantidad de personas por teclado
        System.out.println("Introduce la cantidad de personas que se van a registrar:");
        String cantidadPersonas = System.console().readLine();
        int cantidadPersonasInt = Integer.parseInt(cantidadPersonas);
        int[][] personas = new int[cantidadPersonasInt][2]; // Creo el array con longitud (n x 2) donde n es la cantidad de personas que el usuario ha introducido por teclado y 2 porque siempre se van a introducir el genero y el sueldo para cada persona

        int sumaSueldoHombres = 0;
        int sumaSueldoMujeres = 0;
        int cantidadHombres = 0;
        int cantidadMujeres = 0;

        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) { // Si la el indice de la columna es 0 entonces se tendrá que introducir el genero
                    System.out.println("Introduce el genero de la persona nº: " + (i + 1));
                    String genero = System.console().readLine();
                    int generoInt = Integer.parseInt(genero);
                    personas[i][j] = generoInt;
                } else {
                    System.out.println("Introduce el sueldo de la persona nº: " + (i + 1));
                    String sueldo = System.console().readLine();
                    int sueldoInt = Integer.parseInt(sueldo);
                    personas[i][j] = sueldoInt;
                }
            }
        }

        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < 1; j++) {
                if(personas[i][0] == 0){ // Compruebo el genero de la persona
                    sumaSueldoHombres += personas[i][1];
                    cantidadHombres++;
                }
                else{
                    sumaSueldoMujeres += personas[i][1];
                    cantidadMujeres++;
                }
            }
        }
        // Muestro los resultados
        System.out.println("Sueldo medio hombres: " + (sumaSueldoHombres / cantidadHombres));
        System.out.println("Sueldo medio mujeres: " + (sumaSueldoMujeres / cantidadMujeres));
    }
}
