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

import org.springframework.format.annotation.DateTimeFormat;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 70)
    private String name;

    @Column(nullable = false, columnDefinition = "char(11)")
    private String cpf;

    @Column(nullable = false, name = "data_nascimento")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date nascimento;

    @Column(length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private Genero genero;

    @OneToMany(mappedBy = "pessoa", fetch = FetchType.LAZY)
    private List<Alocacao> alocacoes;
}
