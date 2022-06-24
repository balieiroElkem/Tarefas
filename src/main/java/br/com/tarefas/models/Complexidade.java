package br.com.tarefas.models;

import lombok.Getter;

public enum Complexidade {
    ALTA("ALTA"),
    MEDIA("MEDIA"),
    BAIXA("BAIXA");

    @Getter
    private String nome;

    private Complexidade(String nome) {
        this.nome = nome;
    }
}
