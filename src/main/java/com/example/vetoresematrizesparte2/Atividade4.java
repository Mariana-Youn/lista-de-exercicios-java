//Atividade 4 - Exibir vetor em ordem inversa

package com.example.vetoresematrizesparte2;

public class Atividade4 {
    public static void main(String args[]) {

        int vetor[] = {1, 2, 3, 4, 5};

        System.out.println("Vetor em ordem inversa:");

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
    }
}