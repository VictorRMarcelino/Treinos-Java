package practice;

import java.util.Scanner;

public class bhaskara {
    static double a, b, c, delta, invertedBValue, deltaRoot, value1, value2;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EnterAValue();
    }

    public static void EnterAValue(){
        try {
            System.out.println("enter the value of A: ");
            a = scanner.nextDouble();
            EnterBValue();
        }catch (Exception e){
            System.out.println("The inserted element is invalid! " + e);
        }
    }
    public static void EnterBValue(){
        try {
            System.out.println("enter the value of B: ");
            b = scanner.nextDouble();
            EnterCValue();
        }catch (Exception e){
            System.out.println("The inserted element is invalid! " + e);
        }
    }
    public static void EnterCValue(){
        try {
            System.out.println("enter the value of C: ");
            c = scanner.nextDouble();
            calcDeltaValue();
        }catch (Exception e){
            System.out.println("The inserted element is invalid! " + e);
        }
    }

    public static void calcDeltaValue(){
        delta = (b * b) - (4 * a * c);
        calcNegativeValueOfB();
    }

    public static void calcNegativeValueOfB(){
        invertedBValue = (b * - 1);
        calcDeltaRoot();
    }

    public static void calcDeltaRoot(){
        deltaRoot = Math.sqrt(delta);
        calcValue1();
    }

    public static void calcValue1(){
        value1 = (invertedBValue + deltaRoot)/(2 * a);
        calcValue2();
    }

    public static void calcValue2(){
        value2 = (invertedBValue - deltaRoot)/(2 * a);
        printResults();
    }

    public static void printResults(){
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("Delta: " + delta);
        System.out.println("Inverted of B Value: " + invertedBValue);
        System.out.println("Delta root: " + deltaRoot);
        System.out.println("");
        System.out.println("Primeiro valor : " + value1);
        System.out.println("Segundo valor : " + value2);
    }
}
