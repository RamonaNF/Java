
public class StringInmutable {
    public static void main(String[] args) {
        String seccion = "Mastering Strings", alumna = "Ramona NF";
        String detalle = seccion.concat(" with " + alumna);

        System.out.println("La inmutabilidad de un string...\n");

        System.out.println("seccion.concat(\" with \" + alumna) = " + seccion.concat(" with " + alumna));
        System.out.println("detalle = " + detalle + '\n');

        System.out.println("Aunque el .concat() se aplique sobre seccion...");
        System.out.println("  seccion = " + seccion + '\n');

        System.out.println("Aunque detalle almacene el resultado de aplicar .concat() a seccion...");
        System.out.println("  detalle == seccion { " + (detalle == seccion) + " }\n\n");

        String objetoRetornado = detalle.replace('a', 'A');
        System.out.println("Nueva instancia: " + objetoRetornado);
        System.out.println("Original: " + detalle + "\n\n");

        // Expresiones lambda : Funciones flecha/anónimas
        String theUltimateExample = seccion.transform((s) -> {
            return s + " with " + alumna;
        });
        System.out.println("Nueva instancia: " + theUltimateExample);
        System.out.println("Original: " + seccion + "\n\n");

        System.out.println("¡¡Los string originales se mantienen intactos!!");
    }
}
