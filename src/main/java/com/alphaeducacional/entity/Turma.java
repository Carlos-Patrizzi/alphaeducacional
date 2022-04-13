package com.alphaeducacional.entity;


import lombok.Cleanup;

import javax.persistence.*;

@Entity
@Table(name = "turma")
public class Turma {
    @Id
    @Column(name = "idturma")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTurma;
    @Column(name = "turma")
    private Long turma;
    @Column(name = "grau")
    private String grau;
    @Column(name = "ano")
    private Long ano;
}
