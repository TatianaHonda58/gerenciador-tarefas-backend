package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

    public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
        // O Spring Data já cria todos os métodos de salvar, buscar, deletar e editar aqui.
    }
