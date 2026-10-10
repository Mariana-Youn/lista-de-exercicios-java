//Atividade 9 - Contar números pares em uma matriz

package com.example.vetoresematrizesparte2;

public class Atividade9
{
    public static void main(String args[])
    {
        int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int cont = 0;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (matriz[i][j] % 2 == 0)
                {
                    cont++;
                }
            }
        }

        System.out.println("Quantidade de números pares na matriz: " + cont);
    }
}