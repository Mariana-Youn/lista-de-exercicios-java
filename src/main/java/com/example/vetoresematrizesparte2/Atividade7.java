//Atividade 7 - Encontrar o maior valor de uma matriz

package com.example.vetoresematrizesparte2;

public class Atividade7
{
    public static void main(String args[])
    {
        int matriz[][] = {
            {12, 45, 8},
            {90, 23, 17},
            {5, 31, 60}
        };

        int maior = matriz[0][0];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (matriz[i][j] > maior)
                {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("Maior valor da matriz: " + maior);
    }
}