package iphone;

import iphone.apt.ReprodutorMusical;
import iphone.rpm.AparelhoTelefonico;
import iphone.nvg.NavegadorInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean isLigado = false;
    private boolean isMusicaTocando = false;

    @Override
    public void tocar(String musica) {
        if (isLigado) {
            System.out.println("Tocando a música: " + musica);
            isMusicaTocando = true;
        } else {
            System.out.println("O iPhone está desligado. Não é possível reproduzir música.");
        }
    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {
        if (isMusicaTocando) {
            System.out.println("Música pausada.");
            isMusicaTocando = false;
        } else {
            System.out.println("Não há música tocando para pausar.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (isLigado) {
            System.out.println("Selecionando a música: " + musica);
        } else {
            System.out.println("O iPhone está desligado. Não é possível selecionar música.");
        }
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
        isLigado = true;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void atender() {
        if (isLigado) {
            System.out.println("Chamada atendida.");
        } else {
            System.out.println("O iPhone está desligado. Não é possível atender chamadas.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (isLigado) {
            System.out.println("Iniciando correio de voz.");
        } else {
            System.out.println("O iPhone está desligado. Não é possível iniciar o correio de voz.");
        }
    }

    @Override
    public void exibirPagina(String url) {
        if (isLigado) {
            System.out.println("Exibindo a página: " + url);
        } else {
            System.out.println("O iPhone está desligado. Não é possível exibir a página.");
        }
    }

    @Override
    public void adicionarNovaAba() {
        if (isLigado) {
            System.out.println("Nova aba adicionada ao navegador.");
        } else {
            System.out.println("O iPhone está desligado. Não é possível adicionar uma nova aba.");
        }
    }

    @Override
    public void atualizarPagina() {
        if (isLigado) {
            System.out.println("Página atualizada.");
        } else {
            System.out.println("O iPhone está desligado. Não é possível atualizar a página.");
        }
    }
}
