package com.alphaeducacional.entity;


import javax.persistence.*;

@Entity
@Table(name = "disciplina")
public class Disciplina {
    @Id
    @Column(name = "iddisciplina")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDisciplina;
    @Column(name = "descricao")
    private String descricao;

}
