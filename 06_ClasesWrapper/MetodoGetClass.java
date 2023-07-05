
import java.lang.reflect.Method;

public class MetodoGetClass {
    public static void main(String[] args) {
        System.out.println("MÉTODO getCLASS");
        System.out.println(" Propio de la clase Object, así como equals()");
        System.out.println(" Retorna una instancia de tipo Class\n");

        System.out.println(" Proporciona información sobre la reflexión de un objeto, es decir su estructura interna o metadata");
        System.out.println(" e.g. nombre de la clase, package al que pertenece, metodos, atributos, constructores, clase padre...\n\n");


        String str = "Solo la misma vieja frase :P";
        Class strClass = str.getClass();

        System.out.println("str = " + str);
        System.out.println("strClass = " + strClass + '\n');

        System.out.println("Veamos qué información podemos obtener con la clase...\n");
        
        System.out.println(" Nombre: " + strClass.getSimpleName());
        System.out.println(" Package: " + strClass.getPackageName());
        System.out.println(" *java.lang es el package raíz/principal del lenguaje Javaaa\n\n");


        Integer iint = 99;
        Class intClass = iint.getClass();

        System.out.println("iint = " + iint);
        System.out.println("intClass = " + intClass + '\n');

        System.out.println("           Padre: " + intClass.getSuperclass());
        System.out.println(" Padre del padre: " + intClass.getSuperclass().getSuperclass() + "\n\n");


        Class objClass = intClass.getSuperclass().getSuperclass();

        System.out.println("objClass = " + objClass + '\n');

        System.out.println(" Métodos");
        for(Method metodo: objClass.getMethods()) {
            System.out.println("  " + metodo.getName());
        }
        System.out.println(" *Algunos nombres se repiten por la sobrecarga (i.e. con el mismo nombre, reciben distintos tipos/cantidad de argumentos)");
    }
}
