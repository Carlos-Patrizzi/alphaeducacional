package com.alphaeducacional.endpoint;

import com.alphaeducacional.dto.AlunosDto;
import com.alphaeducacional.dto.ResponsavelDto;
import com.alphaeducacional.dto.TurmaDto;
import com.alphaeducacional.entity.Aluno;
import com.alphaeducacional.entity.Responsavel;
import com.alphaeducacional.entity.Turma;
import com.alphaeducacional.respository.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/alunos")
public class AlunosController {

    @Autowired
    private AlunosRepository alunosRepository;

    @GetMapping
    public ResponseEntity<?> getAlunos(){

        List<Aluno> alunos = alunosRepository.findAll();
        List<AlunosDto> alunosDto = new ArrayList<>();

        for(Aluno al: alunos){

            List<ResponsavelDto> respDto = new ArrayList<>();
            List<TurmaDto> turmDto = new ArrayList<>();

            for(Responsavel resp: al.getResponsaveis())
                respDto.add(ResponsavelDto.builder()
                        .idResponsavel(resp.getIdResponsavel())
                        .nome(resp.getNome())
                        .telefone(resp.getTelefone())
                        .email(resp.getEmail())
                        .endereco(resp.getEndereco())
                        .build()
                );

            for(Turma tur: al.getTurmas())
                turmDto.add(TurmaDto.builder()
                        .idTurma(tur.getIdTurma())
                        .turma(tur.getTurma())
                        .grau(tur.getGrau())
                        .ano(tur.getAno())
                        .build()
                );

            alunosDto.add(
                    AlunosDto.builder()
                            .idAlunos(al.getIdAlunos())
                            .nome(al.getNome())
                            .telefone(al.getTelefone())
                            .email(al.getEmail())
                            .endereco(al.getEndereco())
                            .responsaveis(respDto)
                            .turmas(turmDto)
                            .build()
            );


        }

        return ResponseEntity.ok(alunosDto);
    }

}
