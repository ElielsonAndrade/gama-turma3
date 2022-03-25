	
import java.util.Scanner;


import dados.GerenciaContasHash;

public class AppContas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0, numeroConta;
        double limite, valor;

        GerenciaContasHash contas = new GerenciaContasHash();

        while (opcao != 6) {

            System.out.println("1- Nova Conta Corrente");
            System.out.println("2- Nova Conta Especial");
            System.out.println("3- Depositar");
            System.out.println("4- Sacar");
            System.out.println("5- Consultar Saldo");
            System.out.println("6- Sair");
            System.out.print("Sua opção => ");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do limite:");
                    limite = teclado.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);
                    break;


                case 3:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor:");
                    valor = teclado.nextDouble();

                    if (contas.deposito(numeroConta, valor)) {
                        System.out.println("Deposito realizado.");
                    } else {
                        System.out.println("Falha na operação.");
                    }
                    break;

                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor:");
                    valor = teclado.nextDouble();

                    if (contas.saque(numeroConta, valor)) {
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Falha na operação.");
                    }
                    break;

                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println(contas.getSaldo(numeroConta));
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }

        teclado.close();
    }
}
