package Ex3;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BilheteUnico bilhete;

    static {
        System.out.print("Nome do usuário -->");
        String usuario = sc.nextLine();
        System.out.print("Tipo de tarifa (Estudante ou Professor ou Normal) -->");
        String tipoTarifa = sc.next();
        bilhete=new BilheteUnico(usuario,tipoTarifa);
    }
    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("************************");
            System.out.printf("1. Carregar bilhete%n2. Consultar saldo%n3. Passar na catraca%n4. Finalizar %n->");
            opcao=sc.nextInt();

            switch (opcao){
                case 1 -> carregar();
                case 2 -> consultarSaldo();
                case 3 -> catraca();
                case 4 -> System.out.println("Obrigado por usar o nosso App");
                default -> System.out.println("Opção inválida");
            }

        }while (opcao != 4);
    }

    private static void catraca(){
        if (!bilhete.passarCatraca()){
            System.out.println("Saldo insuficiente");
        }
        consultarSaldo();
    }

    private static void consultarSaldo(){
        System.out.printf("Saldo atual R$%.2f ",bilhete.saldo);
    }

    private static void carregar(){
        double valor;
        System.out.print("Valor da recarga --> R$ ");
        valor=sc.nextDouble();
        bilhete.carregar(valor);
    }
}
