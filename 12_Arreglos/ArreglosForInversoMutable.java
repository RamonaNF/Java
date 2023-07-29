
// Descomentar para ver una alternativa a "arregloInverso"
//import java.util.Arrays;
//import java.util.Collections;

public class ArreglosForInversoMutable {
    public static void main(String[] args) {
        Character[] palabra = {'p', 'u', 'l'};

        System.out.println("MODIFICANDO A LA INVERSA\n");

        System.out.print("La palabra secreta es: " + palabra[0] + palabra[1] + palabra[2]);
        arregloInverso(palabra);
        //Collections.reverse(Arrays.asList(palabra)); 
        System.out.print("" + palabra[0] + palabra[1] + palabra[2] + '\n');
    }

    public static void arregloInverso(Character[] arr) {
        Character temp;
        int len = arr.length - 1, aux = arr.length;

        for(int i = 0; i < aux; i++) {
            temp = arr[i];
            arr[i] = arr[len - i];
            arr[len - i] = temp;
            aux--;
        }
    }
}
