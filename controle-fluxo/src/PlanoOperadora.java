public class PlanoOperadora {
    public static void main(String[] args) {
        // B = basic M=midia T=turdo
        String plano = "T";

        switch (plano) {

            case "T": {
                System.out.println("5Gb YouTube!");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram grátis!");
            }
            case "B": {
                System.out.println("100 minutos de ligação!");
            }
                break;
            default:
                System.out.println("Plano não encontrado!");
                break;

        }
    }

}
