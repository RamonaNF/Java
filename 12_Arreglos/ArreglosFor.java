
import java.util.Arrays;

public class ArreglosFor {
    public static void main(String[] args) {
        int aux = 0;
        String[] posibilidades = {"El Cairo", "Marruecos", "Berlín", "Rabat", "Egipto", "Alemania"};
        String remontada[] = {"Beirut", "Atenas", "Grecia", "Líbano"};

        System.out.println("ITERANDO SOBRE ARREGLOS");
        System.out.println(" ... a Fun with Flags series\n");

        System.out.println("¿Puedes juntar los países con sus capitales?\n");

        System.out.print("Posibilidades: ");
        do {
            System.out.print(posibilidades[aux] + "   ");
            aux++;
        } while(aux != posibilidades.length);

        System.out.println("\n\nRespuestas:");
        Arrays.sort(posibilidades);

        for(int i = 0; i < posibilidades.length; i+=2) {
            System.out.println(" " + posibilidades[i] + ", " + posibilidades[i+1]);
        }

        System.out.print("\n¿Qué tal capitales con países?\n\nPosibilidades: ");

        for(String elem: remontada) {
            System.out.print(elem + "   ");
        }

        System.out.println("\n\nRespuestas:");
        Arrays.sort(remontada);
        aux = remontada.length/2 - 1;

        while(aux > -1) {
            System.out.println(" " + remontada[aux] + ", " + remontada[aux + remontada.length/2]);
            aux--;
        }
    }
}
