
package Algorithms;

public class Algoritmos {
    
    public static int[] bubbleSort(int[] vetor){
        int aux;
        for(int i = 0; i < vetor.length; i++){     //Percorre todo o vetor
            for(int j = 0; j < (vetor.length) - 1; j++){  //Percorre ate o quarto elemento
               if(vetor[j] > vetor[j + 1]){    //Verifica se o numero da esquerda é maior que o da direita 
                   aux = vetor[j];             //Se for, haverá a troca de posição entre os números 
                   vetor[j] = vetor[j+1];
                   vetor[j+1] = aux;
               }
           } 
        }
        return vetor;
    }
    public static int insertionSort(int[] vetor){
        return 0;
    }
    public static int selectionSort(int[] vetor){
        return 0;
    }
    public static int countingSort(int[] vetor){
        return 0;
    }
}
