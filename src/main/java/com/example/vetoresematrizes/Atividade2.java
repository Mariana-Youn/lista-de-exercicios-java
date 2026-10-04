//Atividade 2 - Temperatura em Estufa

package com.example.vetoresematrizes;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double temperatura[] = new double[10];
        int acima = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe a temperatura do dia " + (i + 1) + ":");
            temperatura[i] = entrada.nextDouble();

            if (temperatura[i] > 30) {
                acima = acima + 1;
            }
        }

        System.out.println("Dias com temperatura acima de 30°C: " + acima);

        entrada.close();
    }
}