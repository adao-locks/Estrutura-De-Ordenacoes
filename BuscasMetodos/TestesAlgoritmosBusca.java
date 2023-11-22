public class TestesAlgoritmosBusca {
    public static void main(String[] args) {
        int indice = 0;
        int[] vetorX = Buscas.criaVetorEmbaralhado(2000483647);
        System.out.println("Inicio com 10 casas: \n");
//Inicio da Busca
        System.out.println("Inico da buscaLinearV1: ");
        long tempoIni = System.currentTimeMillis();
        indice = Buscas.buscaLinearV1(vetorX, 7);
        long tempoFim = System.currentTimeMillis();
        System.out.println("Tempo da Busca: " + ((long)(tempoFim - tempoIni)));
        System.out.println("Indice: " + indice +"\n");
    }   
}