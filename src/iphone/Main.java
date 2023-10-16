package iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();


        iphone.ligar("123-456-789");


        iphone.selecionarMusica("Música Legal");
        iphone.tocar("Música Legal");


        iphone.pausar();


        iphone.atender();

        iphone.iniciarCorreioVoz();


        iphone.exibirPagina("www.exemplo.com");


        iphone.adicionarNovaAba();


        iphone.atualizarPagina();
    }
}
