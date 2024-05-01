public class ResultadoEscolarTernario {
    public static void main(String[] args) {

        // ternário encadeado.
        int nota = 10;
        // variavel recebe = ( condição ) ? verdadeira : falsa:
        String resultado = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Prova de recuperação!" : "Reprovado!";
        System.out.println(resultado);
    }

}
