/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingsort;

/**
 *
 * @author Fernandes
 */
public class counting {

    public static void main(String[] args) {

        int teste[] = {75, 565, 3, 3, 1, 7, 55};

        teste = ordenandoCountingSort(teste);

        //Imprime o array
        for (int i = 0; i < teste.length; i++) {
            System.out.println(teste[i]);
        }
    }

    public static int[] ordenandoCountingSort(int[] original) {

        //Veririca o maior valor do vetor
        int maior = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] > maior) {
                maior = original[i];
            }
        }

        //Vetor para verificar recorrencias 
        int contador[] = new int[maior];

        //Vetor Final
        int ordenado[] = new int[original.length];
        int x = 0;

        //Conta as repetições 
        for (int i = 0; i < original.length; i++) {

            int posicao = original[i];
            contador[posicao - 1] = contador[posicao - 1] + 1;
        }

        //Monta o array ordenado
        for (int i = 0; i < contador.length; i++) {

            int quantidade = contador[i];

            //Para casos de números repetidos
            while (quantidade > 0) {
                ordenado[x] = i + 1;
                x++;
                quantidade--;
            }
        }
        return ordenado;
    }
}
