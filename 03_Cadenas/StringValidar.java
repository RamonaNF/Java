
public class StringValidar {
    public static void main(String[] args) {
        String test = null;
        System.out.println("(test == null) isNull: " + (test == null));

        //System.out.println(test.toUpperCase(null)); 

        // Descomentar para ver los errores (NullPointerException)
        System.out.println(" * null permite usar métodos a lo largo del código, pero al ejecutar la aplicación, lanza un error\n");

        //System.out.println(test.concat("... let's do this!! :)"));
        System.out.println("  " + test + "... let's use this!! :)\n\n");


        test = "";
        System.out.println("(test.length() == 0) isEmpty: " + (test.length() == 0));
        System.out.println("test.isEmpty() isEmpty: " + test.isEmpty() + "\n\n");
        

        test = " "; 
        System.out.println("(test == \"\") isEmpty: " + (test == ""));
        System.out.println("test.isBlank() isBlank: " + test.isBlank() + "\n\n"); // true if (isEmpty || hasOnlyWhitespaces)


        System.out.println("VALIDACIONES");
        System.out.println("Nos permiten evitar errores desde etapas tempranas");
    }
}
