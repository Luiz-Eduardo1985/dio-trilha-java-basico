public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        double salarioMinimo = 2500;
        int numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;// erro pois numero normal pode ser maior que short suporta

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;// expressão "final" impede que a variavel troque de valor
        // nome da variavel toda em maiuscula é uma convenção para demonstrar que é um
        // valor constante.
        int numero1 = 1;
        int numero2 = 1;

        boolean simNao = numero1 == numero2;

        System.out.println(simNao);

    }
}
