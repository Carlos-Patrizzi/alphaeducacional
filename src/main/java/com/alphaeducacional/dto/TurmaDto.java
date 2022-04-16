package com.alphaeducacional.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class TurmaDto {
    private Long idTurma;
    private Long turma;
    private String grau;
    private Long ano;
}
