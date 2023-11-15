public class App {

    public static void main(String[] args) {
        int[] vetor = {1, 5, 7, 56, 8, 61, 52, 29, 45, 21, 3, 4, 9, 51, 6};

        System.out.println("Iniciando...");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        //Mude aqui ↓ para trocar a ordenacao
        Ordenacao.mergeSort(vetor);
        /* Ordenações disponíveis:
            bubbleSortIterativoV1
            bubbleSortIterativoV2
            bubbleSortRecursivo
            quickSort
            mergeSort
         */

        System.out.println("\nApós processamento...");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
    }
}