package com.iphone;

import java.util.HashMap;
import java.util.Map;

public class AparelhoTelefonico {
    private boolean emLigacao;
    private String numeroAtual;
    private Map<String, String> contatos;

    public AparelhoTelefonico() {
        emLigacao = false;
        numeroAtual = "";
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, String numero) {
        contatos.put(nome, numero);
        System.out.println("Contato adicionado: " + nome + " - " + numero);
    }

    public void ligar(String nome) {
        String numero = contatos.get(nome);
        if (numero != null) {
            if (!emLigacao) {
                emLigacao = true;
                numeroAtual = numero;
                System.out.println("Ligação iniciada para: " + nome);
            } else {
                System.out.println("O telefone já está em ligação.");
            }
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void atender() {
        if (emLigacao) {
            System.out.println("Ligação atendida.");
            emLigacao = false;
        } else {
            System.out.println("Não há ligação para atender.");
        }
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    public void enviarMensagem(String mensagem) {
        if (!numeroAtual.isEmpty()) {
            System.out.println("Enviando mensagem para " + numeroAtual + ": " + mensagem);
        } else {
            System.out.println("Nenhum número selecionado para enviar mensagem.");
        }
    }

    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();

        telefone.adicionarContato("João", "123-456-789");
        telefone.adicionarContato("Maria", "987-654-321");

        telefone.ligar("João");
        telefone.enviarMensagem("Olá, como vai?");
        telefone.atender();
    }
}
