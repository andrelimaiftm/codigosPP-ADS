public class App {
    public static void main(String[] args) throws Exception {

        GrifoDomestico grifo = new GrifoDomestico();
        
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.aceita(grifo);
    }
}
