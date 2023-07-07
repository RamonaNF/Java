
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {
        System.out.println("CLASE CALENDAR");
        System.out.println(" Clase abstracta (i.e. no permite crear la instancia con el operador new)\n");

        System.out.println("getInstance() Usa la zona horaria y locate para determinar qué instancia crear");
        System.out.println(" e.g. Occidente: Gregorian Calendar");
        System.out.println("      Japón: Japanese Imperial Calendar\n");

        Calendar calendario = Calendar.getInstance();
        System.out.println("calendario = " + calendario + '\n');

        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha + '\n');

        System.out.println("NOTA: Con set() los meses van de 0 a 11, aunque también puedes usar su constante");
        //calendario.set(2022, Calendar.DECEMBER, 9, 18, 57, 0);
      // /*
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, 11);
        calendario.set(Calendar.DAY_OF_MONTH, 9);
        //calendario.set(Calendar.HOUR_OF_DAY, 18);
        calendario.set(Calendar.HOUR, 6);
        calendario.set(Calendar.MINUTE, 57);
        calendario.set(Calendar.SECOND, 0); 
        calendario.set(Calendar.MILLISECOND, 0);
        calendario.set(Calendar.AM_PM, Calendar.PM);
      // */
        
        fecha = calendario.getTime();
        System.out.println("fecha = " + fecha + '\n');

        SimpleDateFormat patron = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SS a");
        String fechaConFormato = patron.format(fecha); 
        System.out.println("fechaConFormato = " + fechaConFormato);

        Calendar actual = Calendar.getInstance();
        Date hoy = actual.getTime();

        if(fecha.compareTo(hoy) < 0) {
            System.out.println("¡Configuraste una fecha antigua ehh! ¿Por qué? :O");
        } else if(fecha.compareTo(hoy) > 0) {
            System.out.println("¿Pensando en el futuro? Digo, por la fecha que configuraste :P");
        } else {
            System.out.println("La fecha configurada coincide con el día de hoy :)");
        }
    }
}
