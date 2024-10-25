// Interface ReprodutorMusical
interface ReprodutorMusical {
    void play(String faixa);

    void pause();

    void stop();
}

// Interface AparelhoTelefonico
interface AparelhoTelefonico {
    void fazerChamada(String numero);

    void receberChamada(String numero);
}

// Interface Navegador
interface Navegador {
    void abrirUrl(String url);

    void fecharNavegador();
}

// Classe IPhone que implementa as interfaces
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
    private final String modelo;
    private final int armazenamento;

    public IPhone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    // Métodos para acessar informações do iPhone
    public String getModelo() {
        return modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    // Implementação dos métodos do Reprodutor Musical
    @Override
    public void play(String faixa) {
        System.out.println("Tocando a faixa: " + faixa);
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void stop() {
        System.out.println("Música parada.");
    }

    // Implementação dos métodos do Aparelho Telefônico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamando: " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    // Implementação dos métodos do Navegador
    @Override
    public void abrirUrl(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Navegador fechado.");
    }

    // Método principal para testar a classe IPhone
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone("iPhone X", 256);

        // Exibindo informações do iPhone
        System.out.println("Modelo do iPhone: " + meuIphone.getModelo());
        System.out.println("Armazenamento do iPhone: " + meuIphone.getArmazenamento() + "GB");

        // Testando o Reprodutor Musical
        meuIphone.play("Song A");
        meuIphone.pause();
        meuIphone.stop();

        // Testando o Aparelho Telefônico
        meuIphone.fazerChamada("123-456-7890");
        meuIphone.receberChamada("098-765-4321");

        // Testando o Navegador
        meuIphone.abrirUrl("https://www.example.com");
        meuIphone.fecharNavegador();
    }
}
