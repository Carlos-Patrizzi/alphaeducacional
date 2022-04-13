package com.alphaeducacional.entity;

import javax.persistence.*;

@Entity
@Table(name = "aula_material")
public class AulaMaterial {

    @Id
    @Column(name = "idaula_material")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAulaMaterial;
    @Column(name = "id_aula")
    private Long idAula;
    @Column(name = "descricao_do-arquivo")
    private String descricaoDoArquivo;
    @Column(name = "nome_do_arquivo")
    private String nomeDoArquivo;
    @Column(name = "disponivel_em")
    private String disponivelEm;
    @Column(name = "disponivel_ate")
    private String DisponivelAte;
}
