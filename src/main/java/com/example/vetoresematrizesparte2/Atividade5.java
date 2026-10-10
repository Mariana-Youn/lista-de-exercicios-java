//Atividade 5 - Calcular a média dos elementos

package com.example.vetoresematrizesparte2;

public class Atividade5 {
    public static void main(String args[]) {

        double notas[] = {8, 7, 9, 10, 6};
        double soma = 0;
        double media;

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        media = soma / notas.length;

        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);
    }
}