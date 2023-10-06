package com.iphone;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private List<String> playlist;
    private boolean emReproducao;
    private int faixaAtual;

    public ReprodutorMusical() {
        playlist = new ArrayList<>();
        emReproducao = false;
        faixaAtual = -1;
    }

    public void adicionarMusica(String musica) {
        playlist.add(musica);
    }

    public void selecionarMusica(int indice) {
        if (indice >= 0 && indice < playlist.size()) {
            faixaAtual = indice;
            System.out.println("Selecionou a música: " + playlist.get(faixaAtual));
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void tocar() {
        if (!emReproducao && faixaAtual != -1) {
            emReproducao = true;
            System.out.println("Tocando a música: " + playlist.get(faixaAtual));
        } else if (faixaAtual == -1) {
            System.out.println("Nenhuma música selecionada");
        } else {
            System.out.println("O reprodutor já está em reprodução");
        }
    }

    public void pausar() {
        if (emReproducao) {
            emReproducao = false;
            System.out.println("Pausando a música: " + playlist.get(faixaAtual));
        } else {
            System.out.println("O reprodutor já está pausado");
        }
    }

    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        reprodutor.adicionarMusica("Evidências");
        reprodutor.adicionarMusica("É o amor");
        reprodutor.adicionarMusica("Vou chorar");

        reprodutor.selecionarMusica(1);
        reprodutor.tocar();
        reprodutor.selecionarMusica(0);
        reprodutor.pausar();
        reprodutor.tocar();
    }
}
