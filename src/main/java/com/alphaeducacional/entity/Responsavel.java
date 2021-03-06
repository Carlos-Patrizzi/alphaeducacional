package com.alphaeducacional.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
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
