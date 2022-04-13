package com.alphaeducacional.entity;


import javax.persistence.*;

@Entity
@Table(name = "responsavel_aluno")
public class ResponsavelAluno {

    @Id
    @Column(name = "idresponsavel_aluno")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idResponsavelAluno;
    @Column(name = "id_responsavel")
    private Long idResponsavel;
    @Column(name = "id_aluno")
    private Long idAluno;

    }
