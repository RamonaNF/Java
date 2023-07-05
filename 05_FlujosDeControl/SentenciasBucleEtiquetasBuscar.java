
public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String tongueTwister = "Juan tuvo un tubo, y el tubo que tuvo se le rompió, y para recuperar el tubo que tuvo, tuvo que comprar un tubo igual al tubo que tuvo";
        int ttLen = tongueTwister.length();

        String search = "tubo";
        int searchLen = search.length();

        int count = 0;

        System.out.println("UN BUSCADOR CON ETIQUETASS\n");
        System.out.println("trabalenguas = \"" + tongueTwister + "\"");

        newSearch:
        for(int i = 0; i <= ttLen - searchLen; i++) {
            for(int j = 0; j < searchLen; j++) {
                if(tongueTwister.charAt(i+j) != search.charAt(j)) {
                    continue newSearch;
                }
            }
            count++;
            i += searchLen - 1; // Optimización: 
                                // La siguiente búsqueda empieza al final de la coincidencia encontrada
        }

        System.out.println("\n\"" + search + "\" se encontró " + count + ((count == 1)?" vez ":" veces ") + "en el trabalenguas");
    }
}
