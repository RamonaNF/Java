
public class StringMetodosArreglos {
    public static void main(String[] args) {
        String test = "anita lava la tina";

        System.out.println("DE STRING A MATRIZ (Arreglo de caracteres)\n");

        System.out.println("test.toCharArray(): " + test.toCharArray().toString());
        System.out.println(" ¿Porqué se imprime así?");
        System.out.println("  Porque char[] es un objeto, así que se está imprimiendo el identificador/hash de la instancia (i.e. su referencia)\n");

        System.out.println("Hay que iterar para ver su contenido...");
        char[] arrChar = test.toCharArray();
        
        for(int i = 0; i < arrChar.length; i++) {
            System.out.print(" " + arrChar[i]);
        }
        System.out.println('\n');

        System.out.println("test.toCharArray(\"la\"): " + test.split("la"));
        System.out.println(" Se puede dividir usando un patrón, pero también resulta en un arreglo (String[]) así que...\n");

        System.out.println("¡Iteremoos!");
        String[] arrStr = test.split("la");

        for(int j = 0; j < arrStr.length; j++) { 
            System.out.println(" " + (j + 1) + ". \"" + arrStr[j] + "\"");
        }
    }
}
