
public class PasarPorReferencia {
    public static void main(String[] args) {
        float[] rango = {1.0F, 1.3F, 1.5F, 1.7F, 2.0F};

        System.out.println("PASANDO POR REFERENCIA...");
        System.out.println("Al mandar una referencia, detrás de cámaras se está pasando un puntero hacia una instancia, por eso se modifica el valor original\n");

        System.out.println("¡Veámoslo en acción!");

        System.out.print("rango { ");
        for(float elem: rango) {
            System.out.print(" " + elem + " ");
        }
        System.out.println(" }");

        test(rango);

        System.out.print("rango { ");
        for(float elem: rango) {
            System.out.print(" " + elem + " ");
        }
        System.out.println(" }");
    }

    public static void test(float[] param) {
        System.out.println("\n ¡Entrando al método test!");
        System.out.println("  param[i] += 1.0F");

        System.out.println("    ¡Ojoo! Un for each no hace la diferencia si solo se cambia el valor de la variable que itera sobre el arreglo ehh");
        for(float elem: param) {
            elem += 1.0F;
        }

        System.out.println("    Porque lo que se busca cambiar son los valores dentro de cada posición del arreglo");
        for(int i = 0; i < param.length; i++) {
            param[i] += 1.0F;
        }

        System.out.println(" Saliendo del método test...\n");
    }
}
