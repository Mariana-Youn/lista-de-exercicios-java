//Atividade 6 - Somar todos os elementos de uma matriz

package com.example.vetoresematrizesparte2;

public class Atividade6
{
    public static void main(String args[])
    {
        int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int soma = 0;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                soma = soma + matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
}