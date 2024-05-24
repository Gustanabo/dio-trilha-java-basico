import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        float saldoCliente;

        // Inserção dos dados
        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência Bancária: ");
        numeroAgencia = scanner.next();

        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.print("Por favor, digite seu Saldo: ");
        saldoCliente = scanner.nextFloat();

        // Exibição dos dados
        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
                ", conta " + numeroConta +
                " e seu saldo " + saldoCliente +
                " já está disponível para saque.");

        scanner.close();
    }
}
