import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem Vindo a Agência YZ\n");
        System.out.print("Por favor, digite o seu nome: ");
        String nome = scanner.next();
        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.next();
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Quanto será seu primeiro depósito: ");
        double saldo = scanner.nextDouble();
        System.out.printf("%nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque%n", nome, agencia, numeroConta, saldo);

       }
}
