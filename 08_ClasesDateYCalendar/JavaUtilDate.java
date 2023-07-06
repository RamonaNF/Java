
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {
        System.out.println("CLASE DATE");
        System.out.println(" Para trabajar con fechas estándar de java\n\n");


        Date formatoEstandar = new Date();
        System.out.println("formatoEstandar = " + formatoEstandar + '\n');

        // Date and Time Patterns: https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat patronPersonalizado = new SimpleDateFormat("MMMM dd, YYYY hh a :)");
        String personalizado = patronPersonalizado.format(formatoEstandar);
        System.out.println("personalizado = " + personalizado);

        patronPersonalizado = new SimpleDateFormat("YYYY 'día' D 'semana' w '|' E dd/MM kk:mm:ss:SS z");
        personalizado = patronPersonalizado.format(formatoEstandar);
        System.out.println("personalizado = " + personalizado + "\n\n");


        // UNIX time, pero en lugar de segundos, en milisegundos
        System.out.println("Usando los milisegundos (desde enero de 1970) para medir el tiempoo\n");
        long suma = 0;

        System.out.print("3... 2... 1... ¡GO!");
        Date ini = new Date();

        for(int i = 0; i < 10000000; i++) {
            suma += i;
        }
        System.out.println(" suma = " + suma);

        Date fin = new Date();
        System.out.println("¡Bum! Y tan solo en " + (fin.getTime() - ini.getTime()) + "ms");
    }
}
