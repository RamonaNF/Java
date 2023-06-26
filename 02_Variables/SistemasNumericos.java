
import javax.swing.JOptionPane;

public class SistemasNumericos {
    public static void main(String[] args) {
        // ______________________________________________________________________________

        String title = "Convertidor: Sist numérico";
        String numStr = JOptionPane.showInputDialog(null, "Ingrese un número entero", title, 3);
        int numDecimal = 0;
        
        try {
            numDecimal = Integer.parseInt(numStr);
        } catch (NumberFormatException e) { // Exception
            JOptionPane.showMessageDialog(null, "ERROR\nDebe ingresarse un número entero", title, 0);
            main(args);
            System.exit(0);
        }

        String mensaje = "numDecimal = " + numDecimal + "\n\n";
        String msgBinario = "binaryString: " + Integer.toBinaryString(numDecimal) + '\n';
        String msgOctal = "octalString: " + Integer.toOctalString(numDecimal) + '\n';
        String msgHexadecimal = "hexString: " + Integer.toHexString(numDecimal) + '\n';
        
        mensaje += msgBinario + msgOctal + msgHexadecimal;

        System.out.println("SISTEMA NUMÉRICO\n");
        System.out.println(mensaje);
        JOptionPane.showMessageDialog(null, mensaje, title, 1);

        // ______________________________________________________________________________

        int numBinario = 0b1011; // 0bNUM
        System.out.println("numBinario (0b) = " + numBinario);

        int numOctal = 012; // 0NUM
        System.out.println("numOctal (0) = " + numOctal);

        int numHex = 0x7d3; // 0xNUM
        System.out.println("numHex (0x) = " + numHex + '\n');

        // ______________________________________________________________________________
    }
}
