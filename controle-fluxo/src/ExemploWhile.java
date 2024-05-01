import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        // estrutura de controle de fluxo while

        // while (expressão booleana de validação){
        // comando que será executado ate que a expressão de validação
        // torne-se falsa
        // CUIDADO para criar uma forma de tornar essa expressão falsa em algum momento
        // senão o codigo entrará em loop
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);

    }

}
