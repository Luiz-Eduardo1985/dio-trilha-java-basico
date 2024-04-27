public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Qual canal :" + smartTv.canal);
        System.out.println("Qual volume : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status >> TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("qual volume ? " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("qual canal " + smartTv.canal);

        smartTv.digitarCanal(13);
        System.out.println("qual canal " + smartTv.canal);

    }

}
