package com.example.estruturasrepeticao;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double venda = 0;
        double soma = 0;
        String continuar;

        do {
            System.out.println("Informe o valor da venda: ");
            venda = entrada.nextDouble();
            soma = soma + venda;

            System.out.println("Deseja continuar? (sim ou não)");
            continuar = entrada.next();

        } while (continuar.equalsIgnoreCase("sim"));

        System.out.println("O total é de R$: " + soma);

        entrada.close();
    }
}