package com.alphaeducacional.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "atividades")
public class Atividade {
    @Id
    @Column(name = "idatividades")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAtividades;

    @ManyToOne
    @JoinColumn(name="id_aula", nullable=false)
    private Aula aula;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "pontuacao_da_atividade")
    private String pontuacaoDaAtividade;

    @Column(name = "disponivel_em")
    private String disponivelEm;

    @Column(name = "disponivel_ate")
    private String disponivelAte;

    @OneToMany(mappedBy="atividade")
    private List<AulaAtividadeAluno> aulaAtividadeAlunos;
}
