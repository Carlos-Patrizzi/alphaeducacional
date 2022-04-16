package com.alphaeducacional.entity;


import lombok.Cleanup;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
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

    @OneToMany(mappedBy="turma")
    private List<Aula> aulas;

    @ManyToMany(mappedBy = "turmas")
    private List<Aluno> alunos;
}
