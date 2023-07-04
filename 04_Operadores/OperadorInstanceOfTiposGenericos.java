
public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        System.out.println("INSTANCEOF TIPOS ABSTRACTOS/GENÉRICOS\n");

        System.out.println("Si cada clase en java hereda de la superclase Object,");
        System.out.println("declaremos como Object para poder comparar con cualquier clase\n");

        Object texto = "Soy un objetoo, podría ser literalmente una instancia de cualquier clase ahhhh";
        System.out.println(" texto = " + texto + '\n');

        System.out.println(" texto instanceof Integer = " + (texto instanceof Integer));
        System.out.println(" No soy un Integer, pero ya me puedes comparar con él sabess... a eso le llamo  p r o g r e s o  jeje\n");

        System.out.println("Pasemos a numbers");

        Number num = 34.5;
        System.out.println(" num = " + num + '\n');

        System.out.println(" num instanceof Byte " + (num instanceof Byte));
        System.out.println(" num instanceof Long " + (num instanceof Long));
        System.out.println(" num instanceof Double " + (num instanceof Double) + '\n');

        System.out.println("Ufff excelente servicioo");
        System.out.println("Recordemos nada más que var y Number son por default de tipo Integer/Double ehh (a menos que se indique lo contrario, claro)\n\n");


        System.out.println("¡Una cosa más! Sobre la creación de objetos\n");

        System.out.println(" Formas explícitas");
        System.out.println("  1. Integer num = new Integer(77);");
        System.out.println("  2. Integer num = Integer.valueOf(77); // ¡Es lo que se hace para pasar de la forma implícita a un objetoo!\n");
        
        System.out.println(" Forma implícita");
        System.out.println("  3. Integer num = 77");
    }
}
