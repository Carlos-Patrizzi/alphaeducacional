package com.alphaeducacional.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @Column(name = "idusuarios")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuarios;
    @Column(name = "id_escola")
    private Long idEscola;
    @Column(name = "id_funcao")
    private Long idFuncao;
    @Column(name = "nome")
    private String nome;
    @Column(name = "senha")
    private String senha;
}
