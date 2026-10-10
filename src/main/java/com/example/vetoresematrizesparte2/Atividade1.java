//Atividade 1 - Somar todos os elementos de um vetor

package com.example.vetoresematrizesparte2;

public class Atividade1
{
    public static void main(String args[])
    {
        int vetor[] = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int i = 0; i < vetor.length; i++)
        {
            soma = soma + vetor[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}