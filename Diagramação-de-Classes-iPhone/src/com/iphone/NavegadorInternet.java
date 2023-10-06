package com.iphone;

import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    private List<String> abas;
    private int abaAtual;

    public NavegadorInternet() {
        abas = new ArrayList<>();
        abaAtual = -1;
    }

    public void adicionarNovaAba(String pagina) {
        abas.add(pagina);
        abaAtual = abas.size() - 1;
    }

    public void exibirPagina() {
        if (abaAtual >= 0 && abaAtual < abas.size()) {
            String paginaAtual = abas.get(abaAtual);
            System.out.println("Exibindo página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página para exibir");
        }
    }

    public void atualizarPagina(String novaPagina) {
        if (abaAtual >= 0 && abaAtual < abas.size()) {
            abas.set(abaAtual, novaPagina);
            System.out.println("Página atualizada para: " + novaPagina);
        } else {
            System.out.println("Nenhuma página para atualizar");
        }
    }

    public static void main(String[] args) {
        NavegadorInternet navegador = new NavegadorInternet();

        navegador.adicionarNovaAba("www.google.com");
        navegador.exibirPagina();
        navegador.atualizarPagina("www.github.com");
        navegador.exibirPagina();
    }
}
