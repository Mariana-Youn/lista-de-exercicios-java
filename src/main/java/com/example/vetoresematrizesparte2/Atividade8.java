//Atividade 8 - Somar os elementos de cada linha da matriz

package com.example.vetoresematrizesparte2;

public class Atividade8
{
    public static void main(String args[])
    {
        int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int soma;

        for (int i = 0; i < 3; i++)
        {
            soma = 0;

            for (int j = 0; j < 3; j++)
            {
                soma = soma + matriz[i][j];
            }

            System.out.println("Soma da linha " + (i + 1) + ": " + soma);
        }
    }
}