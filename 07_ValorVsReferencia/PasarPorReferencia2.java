
public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Ramona");

        System.out.println("PASANDO POR REFERENCIA");
        System.out.println(" | Trabajando con objetos de una clase propia\n");

        // Veamos a los modificadores de acceso en acción
        //System.out.println("¡Holaa! Me llamo " + persona.nombre + '\n'); // Descomentar para ver la restricción
                                                                           // Cambia nombre a public para poder usarlo

        System.out.println("persona.nombre = " + persona.leerNombre());
        test(persona);
        System.out.println("persona.nombre = " + persona.leerNombre());
    }

    public static void test(Persona p) {
        System.out.println("\n ¡Entrando al método test!");
        System.out.println("  nuevoNombre = RNF");

        p.modificarNombre("RNF");

        System.out.println(" Saliendo del método test...\n");
    }
}

// OJO: Lo recomendable es siempre crear una clase en un archivo por separado
class Persona {
    // ATRIBUTOS
    private String nombre; /*
                            *  private es un modificador de acceso (principio de visibilidad/ocultación)
                            *    Restringe el acceso y trabajo con la variable únicamente a su clase
                            *    Contraparte: public
                            *
                            *  public 
                            *    Permite acceder y trabajar desde cualquier parte de la aplicación
                            *
                            */

    // MÉTODOS
    public void modificarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String leerNombre() {
        return nombre;
    }
}
