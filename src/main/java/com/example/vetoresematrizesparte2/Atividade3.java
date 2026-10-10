//Atividade 3 - Contar números pares em um vetor

package com.example.vetoresematrizesparte2;

public class Atividade3 {
    public static void main(String args[]) {

        int vetor[] = {4, 7, 8, 11, 16, 20};
        int cont = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                cont++;
            }
        }

        System.out.println("Quantidade de números pares: " + cont);
    }
}