package br.com.tarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// import br.com.tarefas.models.Alocacao;
import br.com.tarefas.models.Alocacao;

@Repository
public interface AlocacaoRepository extends JpaRepository<Alocacao, Long> {
    
}
