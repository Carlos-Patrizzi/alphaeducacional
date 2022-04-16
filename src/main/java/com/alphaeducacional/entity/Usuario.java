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
@Table(name = "usuarios")
public class Usuario {

    @Id
    @Column(name = "idusuarios")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuarios;

    @ManyToOne
    @JoinColumn(name="id_escola", nullable=false)
    private Escola escola;

    @ManyToOne
    @JoinColumn(name="id_funcao", nullable=false)
    private Funcao funcao;

    @Column(name = "nome")
    private String nome;

    @Column(name = "senha")
    private String senha;

    @OneToMany(mappedBy="usuario")
    private List<Aula> aulas;
}
