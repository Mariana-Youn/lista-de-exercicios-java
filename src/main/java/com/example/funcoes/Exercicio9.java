//Exercício 9 - Função para Calcular a Potência de um Número

package com.example.funcoes;

public class Exercicio9
{
    public static void main(String args[])
    {
        int resultado = calcularPotencia(2, 3);

        System.out.println("Resultado da potência: " + resultado);
    }

    public static int calcularPotencia(int base, int expoente)
    {
        int potencia = 1;

        for (int i = 1; i <= expoente; i++)
        {
            potencia = potencia * base;
        }

        return potencia;
    }
}