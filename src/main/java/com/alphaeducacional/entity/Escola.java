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
@Table(name = "Escola")
public class Escola {
    @Id
    @Column(name = "idEscola")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEscola;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "email")
    private String email;

    @Column(name = "logo_tipo")
    private String logoTipo;

    @OneToMany(mappedBy="escola")
    private List<Usuario> usuarios;
}
