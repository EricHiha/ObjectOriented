package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor, aumento;
        int quantidade;
        Produto[] produto = new Produto[2];

        for (int i = 0; i < produto.length; i++) {
            System.out.print("Digite seu nome:");
            nome=sc.next();

            System.out.print("Digite o valor:");
            valor=sc.nextDouble();

            System.out.print("Digite a quantidade do produto:");
            quantidade=sc.nextInt();

            produto[i] = new Produto(nome,valor,quantidade);

            System.out.println("Em porcentagem qual será o aumento do valor do produto?");
            aumento=sc.nextDouble();
            produto[i].aumento(aumento);

            System.out.printf(" %n%s, Você colocou o valor do seu produto de R$%.2f e existem %d no estoque.%n",produto[i].nome,produto[i].valor,produto[i].quantidade);

        }

    }
}
