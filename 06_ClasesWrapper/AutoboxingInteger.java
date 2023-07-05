
public class AutoboxingInteger {
    public static void main(String[] args) {
        int suma = 0;

        System.out.println("AUTOBOXING");
        System.out.println(" Convertir de primitivos (literal) a tipos de referencia\n");

        System.out.println(" > Al asignar un primitivo, automáticamente se hace la conversión con valueOf()\n");
        Integer[] autoBxnArray = {1, 3, 11, 10, 9, 12, Integer.valueOf(22)}; 

        System.out.println(" > Al realizar operaciones, automáticamente se trabaja con los primitivos\n");
        for(Integer elem: autoBxnArray) {
            if(elem % 2 == 0) suma += elem; // Auto: elem.intValue()
        }

        System.out.println("suma = " + suma);
    }
}
