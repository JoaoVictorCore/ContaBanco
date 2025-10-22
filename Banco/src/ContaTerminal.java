import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        DadosCliente dadosCliente = new DadosCliente();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        dadosCliente.setNomeCliente(sc.next());

        System.out.println("Digite sua agencia: ");
        dadosCliente.setAgenciaCliente(sc.next());

        System.out.println("Digite seu numero da conta: ");
        dadosCliente.setContaCliente(sc.nextInt());

        System.out.println("Digite seu saldo: ");
        dadosCliente.setSaldoCliente(sc.nextDouble());

        System.out.println("Olá " + dadosCliente.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + dadosCliente.getAgenciaCliente() + ", conta " + dadosCliente.getContaCliente() + " e seu saldo " + dadosCliente.getSaldoCliente() + " já está disponível para saque."

        );

    }
}
