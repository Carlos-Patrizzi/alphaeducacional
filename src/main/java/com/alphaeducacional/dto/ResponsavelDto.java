package com.alphaeducacional.dto;

import lombok.*;

@Getter
@Setter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponsavelDto {
    private Long idResponsavel;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
}
