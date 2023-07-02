
public class StringExtensionArchivo {
    public static void main(String[] args) {
        String js = "task.js", txt = "to.Do.txt";

        System.out.println("OBTENIENDO LA EXTENSIÓN DE UN ARCHIVO\n");
        
        int extension = js.lastIndexOf('.') + 1;
        System.out.println("substring(?) a partir de lastIndexOf('.') + 1");
        System.out.println(" js = " + js.substring(extension) + '\n');

        String[] dotSplit = txt.split("\\."); // [.]
        System.out.println("last elem of split(\"\\\\.\")");
        System.out.println(" txt = " + dotSplit[dotSplit.length - 1]);
    }
}
