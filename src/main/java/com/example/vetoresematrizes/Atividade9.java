//Atividade 9 - Mapa de Fertilidade do Solo

package com.example.vetoresematrizes;

import java.util.Scanner;

public class Atividade9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double fertilidade[][] = new double[6][6];
        double soma;
        double media;

        for (int i = 0; i < 6; i++) {

            soma = 0;

            System.out.println("Linha " + (i + 1));

            for (int j = 0; j < 6; j++) {

                System.out.println("Informe o valor de fertilidade: ");

                fertilidade[i][j] = entrada.nextDouble();

                soma = soma + fertilidade[i][j];
            }

            media = soma / 6;

            System.out.println("Média de fertilidade da linha " + (i + 1) + ": " + media);
        }

        entrada.close();
    }
}