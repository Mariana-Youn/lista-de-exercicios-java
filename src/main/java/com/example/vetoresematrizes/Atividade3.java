//Atividade 3 - Consumo de Água na Irrigação

package com.example.vetoresematrizes;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double consumo[] = new double[12];
        double maior = 0;
        int setorMaior = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Informe o consumo de água do setor " + (i + 1) + ":");
            consumo[i] = entrada.nextDouble();

            if (consumo[i] > maior) {
                maior = consumo[i];
                setorMaior = i + 1;
            }
        }

        System.out.println("Setor que consumiu mais água: " + setorMaior);
        System.out.println("Maior consumo: " + maior);

        entrada.close();
    }
}