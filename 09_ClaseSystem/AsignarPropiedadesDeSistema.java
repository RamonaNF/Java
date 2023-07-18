
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.FileInputStream;
import java.util.Properties;

public class AsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        System.out.println("PERSONALIZANDO CONFIGURACIONES DE LA APLICACIÓN");
        System.out.println(" 1. Archivo .properties");
        System.out.println(" 2. setProperty()\n");

        try {
            // Leemos el contenido del .properties en forma de bytes
            FileInputStream archivo = new FileInputStream("./config.propertiess");
            Properties properties = new Properties(System.getProperties());

            try {
                properties.load(archivo);
            } catch (IOException e) {
                System.err.println("ERROR: Favor de verificar el archivo " + e.getMessage());
                System.exit(1);
            }

            properties.setProperty("mi.propiedad.personalizada", "yeahhh, así es como se hace :D");

            System.setProperties(properties);
            System.getProperties().list(System.out);

            System.out.println("\nSystem.getProperty(\"mi.propiedad.personalizada\") = " + System.getProperty("mi.propiedad.personalizada"));
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: No existe el archivo " + e.getMessage());
            System.exit(1);
        }

        System.exit(0);
    }
}
