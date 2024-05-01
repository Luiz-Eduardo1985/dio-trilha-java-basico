public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 4) {
                continue; // desconsidera a iteração no momento em que a condição for verdadeira
                // break: //encerra a execução
            }
            System.out.println(numero);

        }
    }
}
