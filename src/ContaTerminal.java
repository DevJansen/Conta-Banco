import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Integer numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Favor Digite o numero da conta: ");
        numeroConta = sc.nextInt();

        sc.nextLine();
        System.out.println("Digite a sua Agencia: ");
        agencia = sc.nextLine();

        System.out.println("Digite o seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o valor do deposito: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta no nosso banco, sua agencia é "
                + agencia + ", conta " + numeroConta + ", saldo R$" + saldo + " já está disponivel para saque.");

        sc.close();

    }
}