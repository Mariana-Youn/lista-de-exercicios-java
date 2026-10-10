//Atividade 2 - Encontrar o maior elemento do vetor

package com.example.vetoresematrizesparte2;

public class Atividade2 {
    public static void main(String args[]) {

        int vetor[] = {12, 45, 8, 90, 23};
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("Maior elemento do vetor: " + maior);
    }
}