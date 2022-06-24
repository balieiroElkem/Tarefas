package br.com.tarefas.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Atividade implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = true)
    private String descricao;

    @Column(nullable = false)
    private Date dataInicio;

    @Column(nullable = false)
    private Date dataTermino;

    @Column(nullable = false, length = 15)
    @Enumerated(EnumType.STRING)
    private Complexidade complexidade;

    @OneToMany(mappedBy = "atividade", fetch = FetchType.LAZY)
    // private List<Alocacao> alocacoes;
    private List<Alocacao> alocacoes;
}
