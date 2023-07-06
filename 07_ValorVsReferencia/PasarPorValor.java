
public class PasarPorValor {
    public static void main(String[] args) {
        int pruebaPrimitivo = 0;
        Integer pruebaClase = 1;

        System.out.println("PASANDO POR VALOR...");
        
        System.out.println("Un primitivo siempre es pasado por valor, así que se mantiene intacto\n");
        System.out.println(" pruebaPrimitivo = " + pruebaPrimitivo);
        test(pruebaPrimitivo);
        System.out.println(" pruebaPrimitivo = " + pruebaPrimitivo + '\n');

        System.out.println("¿Y qué pasa con las clases wrapper?\n");
        System.out.println(" pruebaClase = " + pruebaClase);
        test(pruebaClase);
        System.out.println(" pruebaClase = " + pruebaClase + '\n');
        System.out.println(":O Mantiene su valor aunque sea referenciaaa");
        System.out.println("   Recordemos que estas en particular son inmutables, así que se generan nuevas instancias ante cualquier cambio");


    }

    public static void test(int param) {
        System.out.println("\n ¡Entrando al método test!");
        System.out.println("  param = " + param);

        param += 8;

        System.out.println("  param = " + param);
        System.out.println(" Saliendo del método test...\n");
    }
}
