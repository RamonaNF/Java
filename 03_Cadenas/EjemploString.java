
public class EjemploString {
    public static void main(String[] args) {
        System.out.println("Trabajando con Strings\n");

        // Creación de un objeto (forma implícita vs explícita)
        String instanciaDirecta = "Aún soy un un objeto, solo que java se encarga de todoo :)";
        String usandoConstructor = new String("\"new\" es la forma más común de declarar objetos... yeah");

        // Comparando contenido [.equals()]
        instanciaDirecta = "SoY Un sTrInG... yEaH";
        usandoConstructor = "sOy uN StRiNg... YeAh";

        System.out.println("instanciaDirecta.equals(usandoConstructor) " + instanciaDirecta.equals(usandoConstructor));
        System.out.println("instanciaDirecta.equalsIgnoreCase(usandoConstructor) " + instanciaDirecta.equalsIgnoreCase(usandoConstructor) + "\n\n");

        // Comparando referencias [==]
        System.out.println("instanciaDirecta == usandoConstructor " + (instanciaDirecta == usandoConstructor));

        instanciaDirecta = usandoConstructor = ":O ¿Apuntan al mismo lugar? U obtuvieron el mismo valor";

        System.out.println("¿Qué tal ahoraa? " + (instanciaDirecta == usandoConstructor) + '\n');

        System.out.println("Este cambio se debe a una particularidad de Java...");
        System.out.println("  Al crear un objeto con el mismo valor que uno ya existente,\n   no se crea una nueva instancia para optimizar,\n   sino que se le asigna la referencia que ya lo tiene");
    }
}
