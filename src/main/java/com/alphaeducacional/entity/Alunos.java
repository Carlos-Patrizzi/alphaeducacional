package com.alphaeducacional.entity;

import javax.persistence.*;

@Entity
@Table(name = "alunos")
public class Alunos {

    @Id
    @Column(name = "idalunos")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAlunos;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "senha")
    private String senha;
}
