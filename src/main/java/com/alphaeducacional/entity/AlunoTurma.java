package com.alphaeducacional.entity;


import javax.persistence.*;

@Entity
@Table(name = "aluno_turma")
public class AlunoTurma {

    @Id
    @Column(name = "idaluno_turma")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAlunoTurma;
    @Column(name = "id_aluno")
    private Long idAluno;
    @Column(name = "id_turma")
    private Long idTurma;

}
