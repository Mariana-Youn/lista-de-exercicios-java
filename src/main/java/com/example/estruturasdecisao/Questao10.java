package com.example.estruturasdecisao;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do cliente: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o valor da parcela: ");
        double parcela = sc.nextDouble();

        if (parcela <= salario * 0.30) {
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Empréstimo recusado");
        }

        sc.close();
    }
}