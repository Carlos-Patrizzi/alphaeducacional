package com.alphaeducacional.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "aula_material")
public class AulaMaterial {

    @Id
    @Column(name = "idaula_material")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAulaMaterial;

    @ManyToOne
    @JoinColumn(name="id_aula", nullable=false)
    private Aula aula;

    @Column(name = "descricao_do-arquivo")
    private String descricaoDoArquivo;

    @Column(name = "nome_do_arquivo")
    private String nomeDoArquivo;

    @Column(name = "disponivel_em")
    private String disponivelEm;

    @Column(name = "disponivel_ate")
    private String DisponivelAte;
}
