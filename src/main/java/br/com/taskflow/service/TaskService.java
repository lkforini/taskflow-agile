package br.com.taskflow.service;

import br.com.taskflow.model.Task;
import br.com.taskflow.repository.TaskRepository;

import java.util.List;

public class TaskService {

    private final TaskRepository repository = new TaskRepository();

    public void criar(Task task) {

        repository.salvar(task);

    }

    public List<Task> listar() {

        return repository.listar();

    }

    public Task buscar(int id) {

        return repository.buscarPorId(id);

    }

    public void excluir(int id) {

        repository.remover(id);

    }

    public void atualizar(int id,
                          String titulo,
                          String descricao,
                          String prioridade,
                          String status) {

        Task task = repository.buscarPorId(id);

        if (task != null) {

            task.setTitulo(titulo);
            task.setDescricao(descricao);
            task.setPrioridade(prioridade);
            task.setStatus(status);

        }

    }

}