//Exercício 7 - Função para Determinar o Maior de Três Números

package com.example.funcoes;

public class Exercicio7
{
    public static void main(String args[])
    {
        int resultado = maiorNumero(12, 30, 21);

        System.out.println("O maior número é: " + resultado);
    }

    public static int maiorNumero(int num1, int num2, int num3)
    {
        if (num1 >= num2 && num1 >= num3)
        {
            return num1;
        }
        else if (num2 >= num1 && num2 >= num3)
        {
            return num2;
        }
        else
        {
            return num3;
        }
    }
}