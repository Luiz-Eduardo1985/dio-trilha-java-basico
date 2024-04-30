import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: conhecer e importar a classe scanner

        // exibir as mensagens para nosso usuario

        // obter pelo scanner os valor digitados no terminal

        // exibir a mensagem conta criada "Por favor, digite o número da Agência !"

        Scanner sc = new Scanner(System.in);

        double Saldo = 25.00;

        System.out.println("Por favor, digite o número do banco !");
        int Numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String Agencia = sc.next();

        System.out.println("Por favor, digite o seu nome !");
        String Nome = sc.next();

        System.out.println("Olá " + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia
                + ", conta " + Numero + " é seu saldo de R$ " + Saldo + " já está disponível para saque");

        sc.close();
    }
}
