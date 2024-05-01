public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formataCep("02918000");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negócio!");
            ;
        }
    }

    static String formataCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        // simulando um cep formatado
        return cep;
    }
}
