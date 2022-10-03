package com.mycompany.exercicio8;

import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Exercicio8 {

    public static void main(String[] args) {
//        Entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor/hora: ");
        int valor_hora = entrada.nextInt();
        System.out.print("");
        System.out.print("Entre com as horas trabalhadas no mês: ");
        int horas_mes = entrada.nextInt();
        entrada.close();

//        Calculo do salario referido do mês
        int salario_mes = valor_hora * horas_mes;
        System.out.print("O valor do seu salário mensal é: " + salario_mes);
    }
}
