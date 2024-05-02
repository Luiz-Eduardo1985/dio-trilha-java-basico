import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        contar(parametroUm, parametroDois);
        terminal.close();
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        try {
            int numero = 1;
            if (parametroDois >= parametroUm) {
                for (int i = parametroDois; i > parametroUm; i--) {
                    System.out.println("Imprimindo o número " + numero);
                    numero++;
                }
            } else {
                throw new ParametrosInvalidosException();

            }
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
