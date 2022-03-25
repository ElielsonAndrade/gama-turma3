package projmodelo.dados;

import java.util.ArrayList;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial;

public class GerenciaContas {
    private ArrayList<Conta> contas;

    public GerenciaContas() {
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        contas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        contas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        contas.add(new ContaPoupanca(numeroConta));
    }

    for (int i = 0; i < contas.size(); i++) {
    if(contas.get(i).getNumero() == numeroConta) {
    System.out.println(contas.get(i));
    break; 
    }
    }

    public String getSaldo(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta.toString();
            }
        }
        return "Conta não encontrada.";
    }

    public boolean deposito(int numeroConta, double valor) {
        for (Conta conta : contas) { 
            if (conta.getNumero() == numeroConta) {
                return conta.deposito(valor);
            }
        }
        return false;
    }

    public boolean saque(int numeroConta, double valor) {
        for (Conta conta : contas) { 
            if (conta.getNumero() == numeroConta) {
                return conta.saque(valor);
            }
        }
        return false;
    }

}
