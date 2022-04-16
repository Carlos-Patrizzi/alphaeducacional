package com.alphaeducacional.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@Table(name = "responsavel")
public class Responsavel {

    @Id
    @Column(name = "idresponsavel")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idResponsavel;

    @Column(name = "nome")
    private String nome;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @ManyToMany(mappedBy = "responsaveis")
    private List<Aluno> alunos;
}
