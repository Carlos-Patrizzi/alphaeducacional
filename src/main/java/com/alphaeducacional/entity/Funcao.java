package com.alphaeducacional.entity;

import javax.persistence.*;

@Entity
@Table(name = "funcao")
public class Funcao {

    @Id
    @Column(name = "idfuncao")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFuncao;
    @Column(name = "nome")
    private String nome;
    @Column(name = "professor")
    private String professor;
    @Column(name = "descricao")
    private String descricao;

}
