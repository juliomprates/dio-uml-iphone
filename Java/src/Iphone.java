import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + " ...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida!");
        System.out.println("Em ligação...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Sua chamada foi encaminhada para a Caixa Postal");
        System.out.println("Deixe sua mensagem");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página no endereço: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Sua música está sendo reproduzida");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica + " está tocando agora...");
    }
}
