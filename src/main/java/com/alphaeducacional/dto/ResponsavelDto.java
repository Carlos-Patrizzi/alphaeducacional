package com.alphaeducacional.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class ResponsavelDto {
    private Long idResponsavel;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
}
