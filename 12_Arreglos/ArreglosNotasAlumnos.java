
import java.util.Scanner;
import java.lang.Math;

public class ArreglosNotasAlumnos {
    public static void main(String[] args) {
        double[] mate = {7.7, 8.6, 3, 8.7, 9.9, 5.4, 9.2}; 
        double[] historia = {8.4, 7.9, 10, 8, 9.1, 6.7, 8.5}; 
        double[] lengua = {9, 9.8, 8, 8.2, 7.7, 8.8, 8.8};
        
        double avg = 0, avgMate = 0, avgHistoria = 0, avgLengua = 0;
        Scanner scanner = new Scanner(System.in);
        int alumno = -1;

        System.out.println("BOLETAS\n");

        for(int i = 0; i < mate.length; i++) {
            avgMate += mate[i];
            avgHistoria += historia[i];
            avgLengua += lengua[i];
        }

        avgMate /= mate.length;
        avgHistoria /= historia.length;
        avgLengua /= lengua.length;

        System.out.println("Promedios generales");
        System.out.println(" Matemáticas: " + Math.round(avgMate));
        System.out.println(" Historia: " + Math.round(avgHistoria));
        System.out.println(" Lengua: " + Math.round(avgLengua) + '\n');

        while(true) {
            System.out.println("Ingrese la clave de un alumno para obtener su promedio (0 para salir)");
            System.out.print("Alumno: ");
            alumno = scanner.nextInt();

            if(alumno == 0) break;
            if(alumno < 0 || alumno > mate.length) {
                System.out.println("\nERROR: Favor de verificar la clave proporcionada\n");
                continue;
            }
            
            avg = (mate[--alumno] + historia[alumno] + lengua[alumno])/3;
            System.out.println("Promedio: " + avg + '\n');
        }

        scanner.close();
    }
}
