
import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        StringBuilder aux = new StringBuilder("");

        System.out.println("ARREGLOS");
        System.out.println(" Contienen elementos asociados a una llave\n");

        int[] nums = new int[4];
        System.out.println("Valor numérico por defecto: " + nums[nums.length - 1]);

        String productos[] = {null, "USB", "Celular", "Disco duro", "Cuaderno", "Laptop", "Cámara"};
        System.out.println("Objeto por defecto: " + productos[0] + '\n');

        nums[0] = 90;
        System.out.println("Inicialización: nums[0] = " + nums[0]);

        productos[0] = "Bicicleta";
        System.out.println("           productos[0] = \"" + productos[0] + "\"\n");
        
        System.out.println("Arrays[helper class].sort()");
        System.out.print(" Original: { ");

        for(String elem: productos) {
            aux.append(elem).append(", ");
        }
        aux.append("\b\b }");
        System.out.println(aux.toString());

        Arrays.sort(productos);
        System.out.print(" Ordenado: { ");

        aux = new StringBuilder("");
        for(String elem: productos) {
            aux.append(elem).append(", ");
        }
        aux.append("\b\b }");
        System.out.println(aux.toString() + '\n');

        System.out.print("OJO Excediendo el límite de un arreglo:\n nums[nums.length] = ");
        System.out.println(nums[nums.length]); // Comentar para evitar el error
    }
}
