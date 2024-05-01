import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quem precisa Dormir?");
        String nome = sc.nextLine();

        System.out.println("Quantos carneirinhos ele quer contar?");
        int qtd = sc.nextInt();

        // estrutura do controle de fluxo FOR
        // for (bloco de inicialização ; expressão booleana de validação ; bloco de
        // atualização ) {
        // comando que será executado ate que a expressão s
        // de validação torne-se falsa.
        String y = "carneirinho";
        for (int x = 1; x <= qtd; x++) {
            String contagem = x == 1 ? "Contando: " + x + " " + y : "Contando: " + x + " " + y + "s";
            System.out.println(contagem);
            // if (x > 1) {
            // System.out.println("Contando: " + x + " " + y + "s");
            // } else {
            // System.out.println("Contando: " + x + " " + y);
            // }
        }
        System.out.println(nome + " dormiu!");
        sc.close();
    }

}
