public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 3.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Seu novo saldo é: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

}
