package src;

import java.util.Scanner;

public class exercicio2 extends exercicio1{
    //Faça um algoritmo que receba o salário de um funcionário, calcule e mostre o novo salário,
    //sabendo-se que este sofreu um aumento de 25%

    public static double salarioFuncionaro, aumento, novoSalario;

    public static void main(String[] args) {
        System.out.println("Insira seu salário");
        salarioFuncionaro = scanner.nextDouble();
        novoSalario = salarioFuncionaro * 1.25;
        System.out.println("Novo salário: " + novoSalario);
    }
}
