
import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {
        System.out.println("VARIABLES DE ENTORNO\n");

        Map<String, String> envVariables = System.getenv();
        //System.out.println("Variables de ambiente del sistema\n" + envVariables + '\n');

        System.out.println("Listando variables de entorno del sistema...");
        for(String key: envVariables.keySet()) {
            System.out.println(key + " = " + envVariables.get(key));
        }

        String variable = System.getenv("USERNAME");
        System.out.println("\nusername = " + variable);

        variable = System.getenv("HOME");
        System.out.println("home = " + variable);

        variable = System.getenv("TEMP");
        System.out.println("temp = " + variable);

        variable = envVariables.get("PATH");
        System.out.println("path = " + variable + '\n');

        System.out.println("Establecer variables de entorno");
        System.out.println("  Windows | setx EASTER_EGG \"You found mee :D\"");
        System.out.println("    Linux | export EASTER_EGG = \"You found mee :D\"\n");

        variable = envVariables.get("EASTER_EGG");
        System.out.println("easter_egg = " + variable);
    }
}
