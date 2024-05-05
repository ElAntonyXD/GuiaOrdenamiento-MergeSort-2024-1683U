public class App {

    public static void main(String[] args) throws Exception {
        int[] Arr = { 45, 57, 2, 95, 6 };
        int n = Arr.length;

        System.out.println("Este es el arreglo desordenado:");
        for (int num : Arr) {
            System.out.println(num + " ");
        }

        MergeSort(Arr, 0, n - 1);

        System.out.println("Este es el arreglo ya ordenado:");
        for (int num : Arr) {
            System.out.println(num + "");
        }

    }

    private static void Merge(int[] Arr, int izquierda, int medio, int derecha) {
        int TamañoIzquierda = medio - izquierda + 1;
        int TamañoDerecha = derecha - medio;

        int[] temporalIzquierda = new int[TamañoIzquierda];
        int[] temporalDerecha = new int[TamañoDerecha];

        for (int i = 0; i < TamañoIzquierda; i++) {
            temporalIzquierda[i] = Arr[izquierda + i];
        }
        for (int j = 0; j < TamañoDerecha; j++) {
            temporalDerecha[j] = Arr[medio + 1 + j];
        }

        int i = 0, j = 0;
        int k = izquierda;

        while (i < TamañoIzquierda && j < TamañoDerecha) {
            if (temporalIzquierda[i] <= temporalDerecha[j]) {
                Arr[k] = temporalIzquierda[i];
                i++;

            } else {
                Arr[k] = temporalDerecha[j];
                j++;

            }
            k++;

        }

        while (i < TamañoIzquierda) {
            Arr[k] = temporalIzquierda[i];
            i++;
            k++;

        }

        while (j < TamañoDerecha) {
            Arr[k] = temporalDerecha[j];
            j++;
            k++;

        }

    }

    public static void MergeSort(int[] Arr, int izquierda, int derecha) {

        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;
            MergeSort(Arr, izquierda, medio);
            MergeSort(Arr, medio + 1, derecha);

            Merge(Arr, izquierda, medio, derecha);

        }
    }
}
