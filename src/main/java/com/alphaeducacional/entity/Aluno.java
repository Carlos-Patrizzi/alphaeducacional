package com.alphaeducacional.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "alunos")
public class Aluno {

    @Id
    @Column(name = "idalunos")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long idAlunos;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "responsavel_aluno",
            joinColumns = { @JoinColumn(name = "id_aluno") },
            inverseJoinColumns = { @JoinColumn(name = "id_responsavel") }
    )
    private List<Responsavel> responsaveis;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "aluno_turma",
            joinColumns = { @JoinColumn(name = "id_aluno") },
            inverseJoinColumns = { @JoinColumn(name = "id_turma") }
    )
    private List<Turma> turmas;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "senha")
    private String senha;

    @OneToMany(mappedBy="aluno")
    private List<AulaAtividadeAluno> aulaAtividadeAlunos;
}
