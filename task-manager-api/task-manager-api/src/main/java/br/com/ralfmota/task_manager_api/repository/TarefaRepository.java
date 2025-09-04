package br.com.ralfmota.task_manager_api.repository;


import br.com.ralfmota.task_manager_api.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Boa prática adicionar esta anotação
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}