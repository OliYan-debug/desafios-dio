import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = scan.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
            scan.close();
        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException{
        if(param1 > param2) throw new ParametrosInvalidosException();
        int contagem = param2 - param1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número "+i);
        }
    }
}
