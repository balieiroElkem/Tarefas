package br.com.tarefas.models;

import lombok.Getter;

public enum Genero {
    FEMININO("FEMININO"),
    MASCULINO("MASCULINO");

    @Getter
    private String nome;

    private Genero(String nome) {
        this.nome = nome;
    }
}
