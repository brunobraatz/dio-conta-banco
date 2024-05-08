import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numConta;
        String numAgencia;
        String nomeCliente;
        double saldoConta;

        System.out.println("Informe o nome do cliente: ");
        nomeCliente = input.next();

        System.out.println("Informe o número da agência: ");
        numAgencia = input.next();

        System.out.println("Informe o número da conta: ");
        numConta = input.nextInt();

        System.out.println("Informe o saldo disponível em conta: ");
        saldoConta = input.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é: "+ numAgencia + ", conta: "+ numConta + " e seu saldo atual é de: "+ saldoConta);

    }
}
