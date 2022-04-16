package com.alphaeducacional.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
public class AlunosDto {
    private Long idAlunos;

    private List<ResponsavelDto> responsaveis;

    private List<TurmaDto> turmas;

    private String nome;

    private String email;

    private String endereco;

    private String telefone;


}
