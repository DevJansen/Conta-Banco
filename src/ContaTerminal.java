import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("==============================================");
            System.out.println("===== Bem vindo ao Terminal do Banco Dio =====");
            System.out.println("==============================================");
            System.out.println(" ");


            System.out.println("Digite a sua Agência separado pelo digito (-) EX (000-0)");
            agencia = sc.nextLine();

            System.out.println("Favor Digite o numero da conta (Somente Numero)");
            numeroConta = sc.nextInt();

            sc.nextLine();
            System.out.println("Digite o seu nome: ");
            nomeCliente = sc.nextLine();

            System.out.println("Digite o valor do deposito: ");
            saldo = sc.nextDouble();

            System.out.println("======= Banco Dio =======");

            System.out.printf("Olá %s,  obrigado por criar uma conta no nosso banco Dio! \n" +
                    "A sua Agência é : %s, Conta: %s, valor disponivel para Saque é: R$ %.2f%n",
                    nomeCliente, agencia, numeroConta, saldo);

        }catch ( InputMismatchException e){
            System.out.println(" Valor digitado no formato errado!!! ");
        }
    }
}