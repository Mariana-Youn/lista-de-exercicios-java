//Exercício 5 - Função para Calcular a Média de Três Notas

package com.example.funcoes;

public class Exercicio5
{
    public static void main(String args[])
    {
        double resultado = calcularMedia(8.0, 7.0, 9.0);

        System.out.println("Média das notas: " + resultado);
    }

    public static double calcularMedia(double nota1, double nota2, double nota3)
    {
        return (nota1 + nota2 + nota3) / 3;
    }
}