package com.alphaeducacional.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "aula_atividade_aluno")
public class AulaAtividadeAluno {

    @Id
    @Column(name = "idaula_atividade_aluno")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAulaAtividadeAluno;

    @ManyToOne
    @JoinColumn(name="id_atividade", nullable=false)
    private Atividade atividade;

    @ManyToOne
    @JoinColumn(name="id_aluno", nullable=false)
    private Aluno aluno;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "arquivo")
    private String arquivo;

    @Column(name = "nota")
    private String nota;

}
