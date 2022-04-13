package com.alphaeducacional.entity;


import javax.persistence.*;

@Entity
@Table(name = "aula")
public class Aula {
    @Id
    @Column(name = "idaula")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAula;
    @Column(name = "id_disciplina")
    private Long idDisciplina;
    @Column(name = "id_turma")
    private Long idTurma;
    @Column(name = "id_usuario")
    private Long idUsuario;
    @Column(name = "dias")
    private String dias;
    @Column(name = "horario")
    private String horario;
}
