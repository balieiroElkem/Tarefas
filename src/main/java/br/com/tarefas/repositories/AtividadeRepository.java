package br.com.tarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tarefas.models.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
    
}
