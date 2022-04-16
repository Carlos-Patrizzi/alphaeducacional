package com.alphaeducacional.respository;

import com.alphaeducacional.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunosRepository extends JpaRepository<Aluno, Long> {
}
