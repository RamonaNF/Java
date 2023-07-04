
public class OperadorInstanceOf {
    public static void main(String[] args) {
        System.out.println("INSTANCEOF\n");

        String txt = "¿De verdad soy un String? ¿Cómo saberloo?";
        Integer numInt = 77;
        Float numFloat = 8.9F;

        System.out.println("txt = " + txt);
        System.out.println("txt instanceof String = " + (txt instanceof String) + " yeahh\n");

        System.out.println("Ojito, no podemos comparar entre clases lejanas ehh");
        System.out.println(" i.e. txt instanceof Integer = SINTAXIS ERROR (no hay ancestro, jerarquía o algo en común que los una)\n");
        //System.out.println("      txt instanceof Integer = " + txt instanceof Integer + '\n'); // Descomentar para ver el error

        System.out.println("Eso sí... toda instancia es tipo Object");
        System.out.println(" numInt instanceOf Object = " + (numInt instanceof Object) + '\n');

        System.out.println("Veamos otras particularidades jujujuu...\n");

        System.out.println(" ¿Qué tienen en común byte, short, int, long, float y double?");
        System.out.println(" ¡Son números! Así que su ancestro es Number\n");

        System.out.println(" numFloat instanceOf Number = " + (numFloat instanceof Number) + '\n');

        System.out.println("Nota mental");
        System.out.println(" Autoboxing: Asignamos un primitivo a una clase y java lo convierte en objeto");
    }
}
