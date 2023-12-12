/**
 * Este programa almacena la nota de los 5 examenes de 4 alumnos en un array, pide las notas de cada alumno por teclado y luego muestra la nota maxima, la minima y la media
 * 
 * @author Sergio Peña 
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        double[][] alumnos = new double[4][5]; // Creo el array con un tamaño de 4x5
        double notaMinima;
        double notaMaxima;
        double sumaNotas;

        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < 5; j++) {
                // Pido la nota y la asigno la introduzco en el array
                System.out.println("Introduce la nota de la asignatura " + (j + 1) + " del alumno nº: " + (i + 1));
                String nota = System.console().readLine();
                double notaInt = Double.parseDouble(nota);
                alumnos[i][j] = notaInt;
            }
        }

        for (int i = 0; i < alumnos.length; i++) {
            // Reseteo las variables cada vez que entro en la siguiente fila del array y les asigno el valor de la primera columna
            notaMaxima = alumnos[i][i];
            notaMinima = alumnos[i][i];
            sumaNotas = 0;
            for (int j = 0; j < 5; j++) {
                if(notaMaxima < alumnos[i][j]){ // Compruebo si la nota maxima es mas pequeña que la nota del indice actual
                    notaMaxima = alumnos[i][j];
                }
                if(notaMinima > alumnos[i][j]){ // Compruebo si la nota minima es mas grande que la nota del indice actual
                    notaMinima = alumnos[i][j];
                }
                sumaNotas += alumnos[i][j]; // Voy sumando la suma de todos los examenes
            }
            // Muestro los resultados
            System.out.println("- La nota máxima del alumno " + (i + 1) + " es: " + notaMaxima);
            System.out.println("- La nota mínima del alumno " + (i + 1) + " es: " + notaMinima);
            System.out.println("- La media del alumno " + (i + 1) + " es: " + (sumaNotas / alumnos.length));           
            System.out.println("--------------------------------------------------------------------------------");
        }
    }
}
