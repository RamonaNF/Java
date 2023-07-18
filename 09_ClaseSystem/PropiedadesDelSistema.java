
import java.util.Properties;

public class PropiedadesDelSistema {
    public static void main(String[] args) {
        // System properties: https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
        System.out.println("OBTENIENDO PROPIEDADES DEL SISTEMA\n");

        String property = System.getProperty("java.version");
        System.out.println("java = " + property + System.lineSeparator());

        property = System.getProperty("user.name");
        System.out.println("username = " + property);

        property = System.getProperty("user.home");
        System.out.println("home = " + property);

        property = System.getProperty("user.dir");
        System.out.println("workspace = " + property + System.getProperty("line.separator"));

        Properties properties = System.getProperties();
        properties.list(System.out); // Argumento: instancia tipo print stream
    }
}
