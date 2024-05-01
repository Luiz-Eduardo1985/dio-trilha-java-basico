public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // for each => cria uma variavel de escopo local para iterar com cada item
        // dentro do array
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }

    }

}
