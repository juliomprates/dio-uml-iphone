public class Main {

    public static void main(String[] args) {

    }

    private void showAppMenu() {
        System.out.println("== Aplicativos ==");
        System.out.println("(1) iPod");
        System.out.println("(2) Telefone");
        System.out.println("(3) Safari");
        System.out.println("(4) Desligar o Celular");
    }

    private void showIpodMenu() {
        System.out.println("== Opções do iPod ==");
        System.out.println("(1) Tocar música atual");
        System.out.println("(2) Pausar música atual");
        System.out.println("(3) Escolher música");
    }

    private void showPhoneMenu() {
        System.out.println("== Opções do Telefone ==");
        System.out.println("(1) Ligar para um número");
        System.out.println("(2) Atender chamada");
        System.out.println("(3) Iniciar correio de voz");
    }

    private void showSafariMenu() {
        System.out.println("== Opções do Safari ==");
        System.out.println("(1) Inserir URL");
        System.out.println("(2) Abrir nova aba");
        System.out.println("(3) Atualizar página");
    }
}
