package recursividade;

import java.util.Scanner;

public class Recursividade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o inicio");
        int inicio = scan.nextInt();
        System.out.println("Digite o fim");
        int fim = scan.nextInt();
        if (inicio > fim) {
            contagemRegressiva(inicio, fim);
        } else if (fim > inicio) {
            contagemCrescente(inicio, fim);
        }
    }

    public static void contagemCrescente(int comeco, int fim) {
        if (comeco == fim) {
            System.out.println(fim);
            System.out.println("fim!");
        } else {
            System.out.println(comeco);
            contagemCrescente(comeco+1, fim);
        }
    }

    public static void contagemRegressiva(int comeco, int fim) {
        if (fim == comeco) {
            System.out.println(comeco);
            System.out.println("fim!");
        } else {
            System.out.println(comeco);
            contagemRegressiva(comeco-1, fim);
        }
    }
}
