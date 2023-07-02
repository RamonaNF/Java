
public class StringMetodos {
    public static void main(String[] args) {
        String test = " Just a sentence between whitespaceees ";

        System.out.println("MÉTODOS DE LOS STRINGS");
        System.out.println(" test =" + test + "\n\n");


        System.out.println("Un String es un char[]");
        System.out.println("¿Cuántos chars tiene? .length(): " + test.length() + '\n');

        System.out.println("PORQUÉ ESTÁS GRITANDOOOO");
        System.out.println(".toUpperCase()" + test.toUpperCase() + '\n');

        System.out.println("No estoy gritando, tú estás gritando");
        System.out.println(".toLowerCase()" + test.toLowerCase() + '\n');

        System.out.println("¿Será que escribí una frase común?");
        System.out.println("test.equals(\"Soy una frase común\") { " + test.equals("Soy una frase común") + " }\n");

        System.out.println("Esto es una frase común... nah, el método está truqueado");
        System.out.println("\"Hola Mundo\".equalsIgnoreCase(\"HOLA MUNDO\") { " + "Hola Mundo".equalsIgnoreCase("HOLA MUNDO") + " }\n");

        System.out.print("Veamos una forma de ordenar Strings: "); // Orden lexicográfico
        System.out.println("(< 0) -> va primero | 0 -> idénticos | (> 0) -> va después ");
        System.out.println("\"yo voy primeroo\".compareTo(\"ajá?\") { " + "yo voy primeroo".compareTo("ajá?") + " }\n");

        System.out.println("¿Por qué no? Puees... orden lexicográfico");
        System.out.println("\"yo voy primeroo\".charAt(0) > \"ajá?\".charAt(0) { " + "yo voy primeroo".charAt(0) + " > " + "ajá?".charAt(0) + " } \n");

        System.out.println("Regresemos al test original");
        System.out.println("Palabra secreta: " + test.substring(30, 35));
        System.out.println("Clave: test.substring[ini,fin) -> t.substr(1, 6) + t.substr(17, 25) + t.substr(2, 4) = " + test.substring(1, 6) + test.substring(17, 25) + test.substring(2, 4) + '\n');

        System.out.println("Can you guess the key? Hint: 1 argument");
        System.out.println("Secret msg: " + test.substring(30) + '\n');

        System.out.println("Spot the difference, hint: not anymoreee");
        System.out.println("one = " + test);
        System.out.println("two = " + test.trim() + "\n\n");

        test = "Peter Piper picked a peck of pickled peppers...";
        System.out.println("Tongue twisterss");
        System.out.println(" test = " + test + '\n');

        System.out.println("Which is it? .replace(): " + test.replace('P', '-').replace('p', '_') + '\n');

        System.out.println("1st appearance of \"_\": " + test.indexOf("x"));
        System.out.println("1st appearance of 'P' from 1: " + test.indexOf('P', 1) + '\n'); // 1 -> First considered

        System.out.println("last appearance of '-: " + test.lastIndexOf('X'));
        System.out.println("last appearance of \"pi\" until 28: " + test.lastIndexOf("pi", 28) + '\n'); // 28 -> Last considered

        System.out.println(".contains(\"CharSequence\") " + test.contains("CharSequence"));
        System.out.println(".contains(\"a\") " + test.contains("a") + '\n');

        System.out.println(".startsWith(\"P\", 0) " + test.startsWith("P", 0));
        System.out.println(".startsWith(\"Piper\", 1) " + test.startsWith("Piper", 1) + '\n');

        System.out.println("test.endsWith(\"peppers\") " + test.endsWith("peppers"));
        System.out.println("test.endsWith(\".\") " + test.endsWith(".") + '\n');
    }
}
