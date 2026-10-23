//Exercício 10 - Função para Calcular o IMC

package com.example.funcoes;

public class Exercicio10
{
    public static void main(String args[])
    {
        double resultado = calcularIMC(70.0, 1.75);

        System.out.println("IMC: " + resultado);
    }

    public static double calcularIMC(double peso, double altura)
    {
        return peso / (altura * altura);
    }
}