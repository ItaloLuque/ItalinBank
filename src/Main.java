import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta(2500.00); // saldo inicial
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Transferir Valor");
            System.out.println("3. Receber Valor");
            System.out.println("4. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é: R$" + conta.getSaldo());
                    break;
                case 2:
                    System.out.println("Digite o valor a transferir:");
                    double valorTransferir = scanner.nextDouble();
                    if (conta.transferir(valorTransferir)) {
                        System.out.println("Transferência realizada com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor a receber:");
                    double valorReceber = scanner.nextDouble();
                    conta.receber(valorReceber);
                    System.out.println("Valor recebido com sucesso.");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
