//Atividade 8 - Controle de Pragas

package com.example.vetoresematrizes;

import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int pragas[][] = new int[5][5];
        int maior = 0;
        int regiaoMaior = 0;

        for (int i = 0; i < 5; i++) {

            int total = 0;

            System.out.println("Região " + (i + 1));

            for (int j = 0; j < 5; j++) {

                System.out.println("Informe a quantidade de focos de pragas: ");

                pragas[i][j] = entrada.nextInt();

                total = total + pragas[i][j];
            }

            if (total > maior) {
                maior = total;
                regiaoMaior = i + 1;
            }
        }

        System.out.println("Região com maior quantidade de focos de pragas: " + regiaoMaior);
        System.out.println("Maior quantidade de focos: " + maior);

        entrada.close();
    }
}