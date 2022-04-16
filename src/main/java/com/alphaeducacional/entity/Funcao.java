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
@Table(name = "funcao")
public class Funcao {

    @Id
    @Column(name = "idfuncao")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFuncao;

    @Column(name = "nome")
    private String nome;

    @Column(name = "professor")
    private String professor;

    @Column(name = "descricao")
    private String descricao;

    @OneToMany(mappedBy="funcao")
    private List<Usuario> usuarios;

}
