
import javax.swing.JOptionPane;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"Armando", "Uri", "Mafer", "Perdomo", "Terán", "Chava", "Ramona"};
        int limit = nombres.length;

        boolean encontrado = false;
        String title = "Los ITCs de confianza";
        String busca = JOptionPane.showInputDialog(null, "Busca a tu amix", title, 3);
        
        for(int i = 0; i < limit; i++) {
            if(nombres[i].equalsIgnoreCase(busca)) {
                encontrado = true;
                break;
            }
        }

        JOptionPane.showMessageDialog(null, (encontrado)?'¡'+busca+" está en la lista! :D":busca+" no está en la lista :O", title, (encontrado)?1:2);
    }
}
