
public class ArreglosForOrdenamientoBurbuja {
    public static void main(String[] args) {
        String[] strData = {"tres", "tristes", "tigres", "tragaban", "trigo", "en", "un", "trigal"};
        Integer[] intData = {99, 66, 88, 11, 33, 22, 77, 44, 55, 0};

        System.out.println("\nORDENAMIENTO BURBUJA\n");

        System.out.print("\nOriginal: ");
        printArr(strData);
        System.out.println("Ordenado después de " + burbuja(strData) + " operaciones :P");
        printArr(strData);
        System.out.println("Ordenado después de " + burbujaOptimizado(strData) + " operaciones... y con solo una pequeña optimización ehh :O");
        printArr(strData);

        System.out.print("\nOriginal: ");
        printArr(intData);
        System.out.println("Ordenado después de " + burbuja(intData) + " operaciones :P");
        printArr(intData);
        System.out.println("Ordenado después de " + burbujaOptimizado(intData) + " operaciones :D");
        printArr(intData);
    }

    public static int burbuja(Object[] arr) {
        int op = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(((Comparable) arr[i]).compareTo(arr[j]) > 0) {
                    Object aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
                op++;
            }
        }

        return op;
    }

    public static int burbujaOptimizado(Object[] arr) {
        int op = 0;

        for(int i = 0; i < arr.length - 1; i++) { // -1 porque para la última posición el arreglo ya estará ordenado
            for(int j = 0; j < arr.length - 1 - i; j++) { // - 1 porque comparamos la actual con la siguiente
                                                          // - i porque ya se han ordenado i elementos
                if(((Comparable) arr[j]).compareTo(arr[j + 1]) > 0) {
                    Object aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
                op++;
            }
        }

        return op;
    }

    public static void printArr(Object[] arr) {
        String output = "{ ";

        for(Object elem: arr) {
            output += elem.toString() + ", ";
        }

        output += "\b\b }\n";

        System.out.println(output);
    }
}
