package com.alphaeducacional.entity;


import javax.persistence.*;

@Entity
@Table(name = "atividades")
public class Atividades {
    @Id
    @Column(name = "idatividades")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAtividades;
    @Column(name = "id_aula")
    private Long idAula;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "pontuacao_da_atividade")
    private String pontuacaoDaAtividade;
    @Column(name = "disponivel_em")
    private String disponivelEm;
    @Column(name = "disponivel_ate")
    private String disponivelAte;
}
