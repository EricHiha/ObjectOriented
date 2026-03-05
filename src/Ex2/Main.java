package Ex2;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String nome;
        SenhaAtendimento[] s1 = new SenhaAtendimento[3];

        for (int i = 0; i < s1.length; i++) {
            System.out.print("Digite seu nome:");
            nome=sc.next();

            s1[i]=new SenhaAtendimento(nome);
        }

        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i].capturaDados());
        }

    }
}
