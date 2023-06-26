
public class PrimitivosCaracteres {
    public static void main(String[] args) {
        // ______________________________________________________________________________

        System.out.println("PRIMITIVOS CARACTERES");
        System.out.println("  char\n    "+ Character.BYTES + " byte(s)\n    "+ Character.SIZE + " bit(s)\n");

        System.out.println("El rango de caracteres aceptados puede variar dependiendo del OS");
        System.out.println("(" + Character.MIN_VALUE + ", " + Character.MAX_VALUE + ")\n");

        char simbolo = 'R', unicode = '\u004E', decimal = 70;
        String str = " :)\n"; // Secuencia de caracteres (cadena)

        System.out.println("simbolo: " + simbolo);
        System.out.println("unicode: " + unicode);
        System.out.println("decimal: " + decimal);
        System.out.println(" cadena: " + str);

        System.out.println("(decimal == unicode) { " + (82 == '\u0052') + " }");
        System.out.println("(decimal == simbolo) { " + (82 == 'R') + " }");
        System.out.println("(simbolo == unicode) { " + ('R' == '\u0052') + " }\n");

        // ______________________________________________________________________________

        // Caracteres especiales
        System.out.println("CARACTERES ESPECIALES\n");

        System.out.println("   Retrocesoooo :( + \\b + O -> :(\bO");
        System.out.println("\u0020".repeat(16) + ":P + \\b + D -> :P\bD\n");

        System.out.println("   Retorno carro '\\r' | '\\n' | System.getProperty(\"line.separator\") | System.lineSeparator()");
        System.out.println("     Puede cambiar de a cuerdo con el OS, los métodos usan el compatible" + System.lineSeparator());

        // ______________________________________________________________________________

        // Concatenar chars (cuidado con su valor decimal)
        System.out.println(new String(new char[]{simbolo, unicode, decimal}) + str);

        StringBuilder option2 = new StringBuilder();
        option2.append(simbolo);
        option2.append(unicode);
        option2.append(decimal);
        System.out.println(option2.toString() + str);

        // ______________________________________________________________________________
    }
}
