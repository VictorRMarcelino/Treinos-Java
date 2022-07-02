package src;

import java.util.Scanner;

public class notas {
    // Faça um algoritmo que receba três notas e seus respectivos pesos, calcule e mostre a média
    //ponderada dessas notas

    public int getNota() {
        return nota;
    }

    public int getPeso() {
        return peso;
    }

    public int nota;
    public int peso;
    public static int mediaPonderada;
    static Scanner scanner = new Scanner(System.in);
    static notas nota1 = new notas();
    static notas nota2 = new notas();
    static notas nota3 = new notas();

    public static void main(String[] args) {
        System.out.println("Insira a primeira nota");
        nota1.nota = scanner.nextInt();
        nota1Peso();
    }

    public static void nota1Peso() {
        System.out.println("Insira o peso da primeira nota");
        nota1.peso = scanner.nextInt();
        nota2();
    }

    public static void nota2() {
        System.out.println("Insira a segunda nota");
        nota2.nota = scanner.nextInt();
        nota2Peso();
    }

    public static void nota2Peso() {
        System.out.println("Insira o peso da segunda nota");
        nota2.peso = scanner.nextInt();
        nota3();
    }

    public static void nota3() {
        System.out.println("Insira a terceira nota");
        nota3.nota = scanner.nextInt();
        nota3Peso();
    }

    public static void nota3Peso() {
        System.out.println("Insira o peso da terceira nota");
        nota3.peso = scanner.nextInt();
        calculoMediaPonderada();
    }

    public static void calculoMediaPonderada() {
        mediaPonderada =
        ((nota1.getNota() * nota1.getPeso())
        + (nota2.getNota() * nota2.getPeso())
        + (nota3.getNota() * nota3.getPeso()))
        / (nota1.getPeso() + nota2.getPeso() + nota3.getPeso());
        System.out.println("Resultado media ponderada" + mediaPonderada);
    }
}
