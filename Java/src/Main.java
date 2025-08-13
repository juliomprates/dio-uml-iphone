import java.util.Scanner;

public class Main {

    private final static Scanner scan = new Scanner(System.in).useDelimiter("\\n");

    private final static Iphone iphone = new Iphone();

    public static void main(String[] args) {

        while (true) {
            showAppMenu();
            menuPrincipal:
            switch (scan.next()) {
                case "1" -> {
                    while(true) {
                        showIpodMenu();
                        switch (scan.next()) {
                            case "1" -> iphone.tocar();
                            case "2" -> iphone.pausar();
                            case "3" -> {
                                System.out.println("Qual música música deseja reproduzir: ");
                                iphone.selecionarMusica(scan.next());
                            }
                            case "4" -> {
                                break menuPrincipal;
                            }
                            default -> System.out.println("Opção inválida");
                        }
                    }
                }

                case "2" -> {
                    while(true) {
                        showPhoneMenu();
                        switch (scan.next()) {
                            case "1" -> {
                                System.out.println("Número: ");
                                iphone.ligar(scan.next());
                            }
                            case "2" -> iphone.atender();
                            case "3" -> iphone.iniciarCorreioDeVoz();
                            case "4" -> {
                                break menuPrincipal;
                            }
                            default -> System.out.println("Opção inválida");
                        }
                    }
                }

                case "3" -> {
                    while(true) {
                        showSafariMenu();
                        switch (scan.next()) {
                            case "1" -> {
                                System.out.println("Insira a URL que deseja acessar: ");
                                iphone.exibirPagina(scan.next());
                            }
                            case "2" -> iphone.adicionarNovaAba();
                            case "3" -> iphone.atualizarPagina();
                            case "4" -> {
                                break menuPrincipal;
                            }
                            default -> System.out.println("Opção inválida");
                        }
                    }
                }

                case "4" -> {
                    scan.close();
                    System.out.println("Desligando...");
                    System.exit(0);
                }

                default -> System.out.println("Opção inválida");
            }
        }

    }

    private static void showAppMenu() {
        System.out.println("== Aplicativos ==");
        System.out.println("(1) iPod");
        System.out.println("(2) Telefone");
        System.out.println("(3) Safari");
        System.out.println("(4) Desligar o Celular\n");
    }

    private static void showIpodMenu() {
        System.out.println("\n== Opções do iPod ==");
        System.out.println("(1) Tocar música atual");
        System.out.println("(2) Pausar música atual");
        System.out.println("(3) Escolher música");
        System.out.println("(4) Sair\n");
    }

    private static void showPhoneMenu() {
        System.out.println("\n== Opções do Telefone ==");
        System.out.println("(1) Ligar para um número");
        System.out.println("(2) Atender chamada");
        System.out.println("(3) Iniciar correio de voz");
        System.out.println("(4) Sair\n");
    }

    private static void showSafariMenu() {
        System.out.println("\n== Opções do Safari ==");
        System.out.println("(1) Inserir URL");
        System.out.println("(2) Abrir nova aba");
        System.out.println("(3) Atualizar página");
        System.out.println("(4) Sair\n");
    }
}
