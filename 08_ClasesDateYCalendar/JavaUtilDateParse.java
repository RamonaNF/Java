
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;

public class JavaUtilDateParse {
    public static void main(String[] args) {
        String pattern = "yyyy-MM-dd";
        Date fecha = new Date(), hoy = new Date();
        SimpleDateFormat patron = new SimpleDateFormat(pattern);

        System.out.println("CONVIRTIENDO DE STRING A DATE");
        System.out.println(" El String debe conincidir con un patrón, así que es obligatorio hacer el parse() dentro de un try catch\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha con formato '" + pattern + "': ");

        try {
            fecha = patron.parse(scanner.next()); 

            System.out.println("\nfecha = " + fecha);
            System.out.println(" con patron = " + patron.format(fecha) + '\n');
        } catch (ParseException e) {
            System.out.println("\nERROR: Favor de verificar el formato de la fecha\n");
            e.printStackTrace();
        }

        System.out.println("hoy = " + hoy);
        System.out.println("fecha.compareTo(hoy) = " + fecha.compareTo(hoy) + '\n');

        if(fecha.before(hoy)) { // compareTo < 0
            System.out.println("¡Ingresaste una fecha antigua ehh! ¿Por qué? :O");
        } else if(fecha.after(hoy)) { // compareTo > 0
            System.out.println("¿Pensando en el futuro? Digo, por la fecha que ingresaste :P");
        } else { // compareTo == 0 | Para entrar aquí deben ser las 00:00:00:00 del día de hoy
            System.out.println("Tu fecha coincide con el día de hoy :)");
            System.out.println("¿Qué haces despierto a estas horass?");
        }

        scanner.close();
    }
}
