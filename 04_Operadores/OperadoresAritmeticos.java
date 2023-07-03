
import javax.swing.JOptionPane;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 1, j  = 3;
        String title = "¿Par o impar?";
        
        System.out.println("OPERADORES ARITMÉTICOS");
        System.out.println(" Usados entre dos variables/literales");
        System.out.println(" * OJO: Se evalúan de izquierda a derecha, perooo siguiendo la prioridad eh\n");

        System.out.println("                  i = " + i);
        System.out.println("                  j = " + j + '\n');

        System.out.println("               SUMA  i + j = " + (i + j));
        System.out.println("              RESTA  i - j = " + (i - j));
        System.out.println("            RESIDUO  i % j = " + (i % j));
        System.out.println("     MULTIPLICACIÓN  i * j = " + (i * j));
        System.out.println("DIVISIÓN (sin cast)  i / j = " + (i / j));
        System.out.println("DIVISIÓN (con cast)  i / j = " + ((float)i / j));

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número", title, 3));

        if(num % 2 == 1) {
            JOptionPane.showMessageDialog(null, num + "...\nTu número es impar", title, 1);
        } else {
            JOptionPane.showMessageDialog(null, num + "...\nTu número es par", title, 1);
        }
    }
}
