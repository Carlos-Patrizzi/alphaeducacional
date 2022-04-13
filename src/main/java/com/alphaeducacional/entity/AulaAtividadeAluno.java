package com.alphaeducacional.entity;


import javax.persistence.*;

@Entity
@Table(name = "aula_atividade_aluno")
public class AulaAtividadeAluno {

    @Id
    @Column(name = "idaula_atividade_aluno")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAulaAtividadeAluno;
    @Column(name = "id_atividade")
    private Long idAtividade;
    @Column(name = "id_aluno")
    private Long idAluno;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "arquivo")
    private String arquivo;
    @Column(name = "nota")
    private String nota;

}
