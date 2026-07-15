import br.com.taskflow.model.Task;
import br.com.taskflow.service.TaskService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    @Test
    void deveCriarUmaTarefa() {

        TaskService service = new TaskService();

        Task task = new Task(
                1,
                "Estudar Java",
                "POO",
                "Alta",
                "A Fazer");

        service.criar(task);

        assertEquals(1, service.listar().size());
    }

    @Test
    void deveBuscarUmaTarefaPorId() {

        TaskService service = new TaskService();

        service.criar(new Task(
                1,
                "Java",
                "Curso",
                "Alta",
                "A Fazer"));

        Task encontrada = service.buscar(1);

        assertNotNull(encontrada);
        assertEquals("Java", encontrada.getTitulo());
    }

    @Test
    void deveAtualizarUmaTarefa() {

        TaskService service = new TaskService();

        service.criar(new Task(
                1,
                "Java",
                "Curso",
                "Alta",
                "A Fazer"));

        service.atualizar(
                1,
                "Java Completo",
                "Curso atualizado",
                "Média",
                "Concluído");

        Task atualizada = service.buscar(1);

        assertEquals("Java Completo", atualizada.getTitulo());
        assertEquals("Concluído", atualizada.getStatus());
    }

    @Test
    void deveExcluirUmaTarefa() {

        TaskService service = new TaskService();

        service.criar(new Task(
                1,
                "Java",
                "Curso",
                "Alta",
                "A Fazer"));

        service.excluir(1);

        assertTrue(service.listar().isEmpty());
    }

    @Test
    void deveListarTresTarefas() {

        TaskService service = new TaskService();

        service.criar(new Task(1,"A","A","Alta","A Fazer"));
        service.criar(new Task(2,"B","B","Alta","A Fazer"));
        service.criar(new Task(3,"C","C","Alta","A Fazer"));

        assertEquals(3, service.listar().size());

    }

}