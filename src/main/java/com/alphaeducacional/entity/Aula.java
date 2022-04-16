package com.alphaeducacional.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "aula")
public class Aula {
    @Id
    @Column(name = "idaula")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAula;

    @ManyToOne
    @JoinColumn(name="id_disciplina", nullable=false)
    private Disciplina disciplina;

    @ManyToOne
    @JoinColumn(name="id_turma", nullable=false)
    private Turma turma;

    @ManyToOne
    @JoinColumn(name="id_usuario", nullable=false)
    private Usuario usuario;

    @Column(name = "dias")
    private String dias;

    @Column(name = "horario")
    private String horario;

    @OneToMany(mappedBy = "aula")
    private List<Atividade> atividades;

    @OneToMany(mappedBy = "aula")
    private List<AulaMaterial> aulaMaterials;


}
