package practice;

import java.util.Scanner;

public class bhaskara {
    static int a, b, c, delta;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EnterAValue();
    }

    public static void EnterAValue(){
        try {
            System.out.println("enter the value of A: ");
            a = scanner.nextInt();
            EnterBValue();
        }catch (Exception e){
            System.out.println("The inserted element is invalid! " + e);
        }finally {
            EndOfProgram();
        }
    }
    public static void EnterBValue(){
        try {
            System.out.println("enter the value of B: ");
            b = scanner.nextInt();
            EnterCValue();
        }catch (Exception e){
            System.out.println("The inserted element is invalid! " + e);
        }finally {
            EndOfProgram();
        }
    }
    public static void EnterCValue(){
        try {
            System.out.println("enter the value of C: ");
            c = scanner.nextInt();
            calcDeltaValue();
        }catch (Exception e){
            System.out.println("The inserted element is invalid! " + e);
        }finally {
            EndOfProgram();
        }
    }

    public static void calcDeltaValue(){
        delta = (b * b) - (4 * a * c);
    }


    public static void EndOfProgram(){
        System.out.println("The program ends here!");
    }
}
