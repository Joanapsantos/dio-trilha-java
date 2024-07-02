import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Agora digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Insira o valor de deposito:");
        double saldo = scanner.nextDouble();

        //imprimindo
        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
