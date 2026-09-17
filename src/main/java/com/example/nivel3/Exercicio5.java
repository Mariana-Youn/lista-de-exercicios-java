package com.example.nivel3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorProduto;

        System.out.println("Informe o valor do produto: ");
        valorProduto = entrada.nextDouble();

        double desconto = valorProduto * 0.15;
        double novoValor = valorProduto - desconto;

        System.out.println("Valor com desconto: " + novoValor);

        entrada.close();
    }
}