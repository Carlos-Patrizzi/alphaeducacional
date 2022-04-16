package com.alphaeducacional.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "disciplina_material")
public class DisciplinaMaterial {
    @Id
    @Column(name = "iddisciplina_material")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDisciplinaMaterial;

    @Column(name = "id_disciplina")
    private Long idDisciplina;

    @Column(name = "turma")
    private Long turma;

    @Column(name = "grau")
    private String grau;

    @Column(name = "nome_do_arquivo")
    private String nomeDoArquivo;

    @Column(name = "descricao_do_material")
    private String descricaoDoMaterial;

    @Column(name = "disponivel_em")
    private String disponivelEm;

    @Column(name = "disponivel_ate")
    private String DisponivelAte;

}
