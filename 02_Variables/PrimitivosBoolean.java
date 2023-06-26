
public class PrimitivosBoolean {
    public static void main(String[] args) {
        // Tipo de dato de lógica binaria, porque representa un valor de verdad (true|false)
        System.out.println("PRIMITIVOS BOOLEANOS");

        boolean primitivo = true;
        boolean objeto = Boolean.FALSE; // De instancia a primitivo (auto: .booleanValue())

        boolean datoLogico = (9987.2 > 1.32e3d);
        System.out.println("  dato lógico = " + datoLogico);
    }
}
