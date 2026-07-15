package br.com.taskflow;

import br.com.taskflow.model.Task;
import br.com.taskflow.service.TaskService;

public class Main {

    public static void main(String[] args) {

        TaskService service = new TaskService();

        service.criar(new Task(
                1,
                "Criar README",
                "Escrever documentação inicial",
                "Alta",
                "A Fazer"));

        service.criar(new Task(
                2,
                "Criar CRUD",
                "Implementar operações básicas",
                "Alta",
                "Em Progresso"));

        System.out.println("===== LISTA DE TAREFAS =====");

        service.listar().forEach(System.out::println);

        System.out.println("\nAtualizando tarefa...");

        service.atualizar(
                2,
                "Criar CRUD",
                "CRUD concluído",
                "Alta",
                "Concluído");

        System.out.println("\n===== APÓS ATUALIZAÇÃO =====");

        service.listar().forEach(System.out::println);

        System.out.println("\nRemovendo tarefa 1...");

        service.excluir(1);

        System.out.println("\n===== LISTA FINAL =====");

        service.listar().forEach(System.out::println);
    }
}