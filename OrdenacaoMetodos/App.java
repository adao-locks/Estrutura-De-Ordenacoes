public class App {

    public static void main(String[] args) {
        int[] vetor = {38,27,43,3,9,82,10};

        System.out.println("Iniciando...");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        //Mude aqui ↓ para trocar a ordenacao
        Ordenacao.bubbleSortIterativoV1(vetor);
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