
public class ArgumentosLineaComando {
    public static void main(String[] args) {
        System.out.println("ARGUMENTOS LÍNEA DE COMANDO\n");

        System.out.println(" Generar el código fuente (.class)");
        System.out.println("  javac ArgumentosLineaComando.java\n");

        System.out.println(" Ejecutar bytecode");
        System.out.println("  java ArgumentosLineaComando [arg0] [...] [argN]\n");

        if(args.length == 0) {
            System.out.println("Oyee... No se ha pasado ningún argumentoo :(");
            System.exit(1);
        }

        for(int i = 0; i< args.length; i++) {
            System.out.println("Argumento " + i + ": " + args[i]);
        }
        
        System.out.println("\nOJO: Si se tienen problemas con los acentos o caracteres especiales, puede compilarse de la siguiente manera:\n");
        System.out.println(" javac nombre.java -encoding utf8");
    }
}
