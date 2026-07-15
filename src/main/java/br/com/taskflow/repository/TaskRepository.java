package br.com.taskflow.repository;

import br.com.taskflow.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private final List<Task> tasks = new ArrayList<>();

    public void salvar(Task task) {
        tasks.add(task);
    }

    public List<Task> listar() {
        return tasks;
    }

    public Task buscarPorId(int id) {

        for (Task task : tasks) {

            if (task.getId() == id) {
                return task;
            }

        }

        return null;
    }

    public void remover(int id) {

        tasks.removeIf(task -> task.getId() == id);

    }

}