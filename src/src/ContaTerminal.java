import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Digite seu nome completo: ");
        nome = obj.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = obj.nextLine();

        System.out.println("Digite o número da conta: ");
        numero = obj.nextInt();

        System.out.println("Digite o valor que gostaria depositar na sua conta: ");
        saldo = obj.nextDouble();

        System.out.println("Olá " +nome+ ", obrigado por criar uma conta em nosso banco, sua agência " +agencia+ ", conta " +numero+ " e seu saldo " +saldo+ " ja está disponível para saque!" );
        obj.close();

    }
}
