package src;
import java.util.*;

public class calcularMedia {
    public static double notaPeso4, notaPeso6, finalPeso4, finalPeso6;
    public static String escolha, materia;
    static Scanner sc = new Scanner(System.in);

    List lista = new ArrayList();


    public static List<Double> listaNotasPeso4 = new ArrayList<>(Arrays.asList());

    public static List<Double> listaNotasPeso6 = new ArrayList<>(Arrays.asList());


    public static void main(String[] args) {
        materia();
    }

    public static void materia(){
        System.out.println("Insira a matéria desejada");
        materia = sc.nextLine();
        adicionaNotaPeso4();
    }


    public static void adicionaNotaPeso4(){
        System.out.println("Insira sua nota peso 4");
        notaPeso4 = sc.nextDouble();
        listaNotasPeso4.add(notaPeso4);
        adicionarNovaNotaPeso4();
    }

    public static void adicionarNovaNotaPeso4(){
        System.out.println("Deseja inserir outra nota? (sim/nao)");
        escolha = sc.nextLine();
        switch (escolha){
            case "sim" -> {
                adicionaNotaPeso4();
            }
            case "nao" -> {
                adicionaNotaPeso6();
            }
            default -> {
                adicionarNovaNotaPeso4();
            }
        }
    }

    public static void adicionaNotaPeso6() {
        System.out.println("Insira sua primeira nota peso 6");
        notaPeso6 = sc.nextDouble();
        listaNotasPeso6.add(notaPeso6);
        adicionarNovaNotaPeso6();
    }

    public static void adicionarNovaNotaPeso6(){
        System.out.println("Deseja inserir outra nota? (sim/nao)");
        escolha = sc.nextLine();
        switch (escolha){
            case "sim" -> {
                adicionaNotaPeso6();
            }
            case "nao" -> {
                calcularNotasPeso4();
            }
            default -> {
                adicionarNovaNotaPeso6();
            }
        }
    }

    public static void calcularNotasPeso4(){
        double sum = 0;
        for(int i = 0; i < listaNotasPeso4.size(); i++){
            sum += listaNotasPeso4.get(i);
        }
        finalPeso4 = (sum/listaNotasPeso4.size()) * 0.4;
        calcularNotasPeso6();
    }

    public static void calcularNotasPeso6(){
        double sum = 0;
        for(int i = 0; i < listaNotasPeso6.size(); i++){
            sum += listaNotasPeso6.get(i);
        }
        finalPeso6 = sum/listaNotasPeso6.size() * 0.6;
        mediaFinal();
    }
    public static void mediaFinal(){
        double notaMediaFinal = finalPeso4 + finalPeso6;
        System.out.println("");
        System.out.println("peso 4: " + finalPeso4);
        System.out.println("peso 6: " + finalPeso6);
        System.out.println("Sua média em " + materia + " é: " + notaMediaFinal);
    }
}
