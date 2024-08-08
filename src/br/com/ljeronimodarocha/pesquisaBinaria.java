package br.com.ljeronimodarocha;

public class pesquisaBinaria {
    public static void main(String[] args) {
        int[] lista = {1, 3, 5, 7, 9, 10, 12, 14, 16, 18};
        System.out.println(pesquisaBinaria(lista, 18));

    }

    static Integer pesquisaBinaria(int[] lista, int item) {
        int baixo = 0;
        int alto = lista.length - 1;
        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];
            if (chute == item) {
                return meio;
            } else if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }

        return null;
    }
}
