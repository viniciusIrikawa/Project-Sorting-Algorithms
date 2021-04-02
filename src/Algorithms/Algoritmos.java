
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
    public static int[] insertionSort(int[] vetor){
        for(int i = 1; i < vetor.length; i++){  //Percorre o array a partir do índice 1
            int atual = vetor[i];  //"atual" será o número posicionado no índice vigente 
            int j = i - 1;     //"j" representará o número anterior ao número atual
            
            while(( j > -1 ) && ( vetor[j] > atual)){  //Verifica se o número anterior é maior que o atual
                 vetor[j + 1] = vetor[j];  //Troca a posição dos números
                 j--;    //Decrementa o vetor
            }
            vetor[j + 1] = atual;  //Atualiza o número atual  
        }
        return vetor;
    }
    
    
    public static int selectionSort(int[] vetor){
        return 0;
    }
    public static int countingSort(int[] vetor){
        return 0;
    }
}
