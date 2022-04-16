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
@Table(name = "disciplina")
public class Disciplina {
    @Id
    @Column(name = "iddisciplina")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDisciplina;

    @Column(name = "descricao")
    private String descricao;

    @OneToMany(mappedBy="disciplina")
    private List<Aula> aulas;

}
